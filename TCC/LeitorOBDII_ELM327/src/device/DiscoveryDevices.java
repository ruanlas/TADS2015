package device;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.StreamConnection;

import bluetooth_connect.ConnectionBluetoothFactory;

public class DiscoveryDevices implements DiscoveryListener {
	
	private Object lock = new Object();
	private Vector remoteDevices = new Vector();
	private LocalDevice localDevice;
	private DiscoveryAgent discoveryAgent;
	private StreamConnection objectConnection;
	private OutputStream outStream;
	private InputStream inStream;
	private String connectionUrl;
	
	public void run() throws BluetoothStateException, IOException {
		localDevice = LocalDevice.getLocalDevice();
		discoveryAgent = localDevice.getDiscoveryAgent();
		this.refreshList();
	}

	public void refreshList() throws BluetoothStateException, IOException {
		if (objectConnection  != null) {
			objectConnection.close();
		}
		discoveryAgent.startInquiry(DiscoveryAgent.GIAC, this);
		try {
			synchronized (lock) {
				lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (remoteDevices.size() <= 0) {
			System.out.println("No Devices found");
		}else {
			for (int i = 0; i < remoteDevices.size(); i++) {
				
				RemoteDevice remote_device = (RemoteDevice)remoteDevices.elementAt(i);
				System.out.println((i+1) + ".)" + remote_device.getFriendlyName(true)+ " " + remote_device.getBluetoothAddress());
				
			}
		}
	}
	
	public void connectToDevice(int index) throws BluetoothStateException, IOException {
		RemoteDevice select_device = (RemoteDevice)remoteDevices.elementAt(index);
		UUID[] uuidset = new UUID[1];
		uuidset[0] = new UUID("1101", true);
		
		discoveryAgent.searchServices(null, uuidset, select_device, this);
		try {
			synchronized (lock) {
				lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (connectionUrl == null) {
			System.out.println("Device does not support SPP.");
		}else {
			System.out.println("Device supports SPP.");
			objectConnection = ConnectionBluetoothFactory.getConnectionBluetooth(connectionUrl);
			outStream = objectConnection.openOutputStream();
			inStream = objectConnection.openInputStream();
		}
	}

	@Override
	public void deviceDiscovered(RemoteDevice arg0, DeviceClass arg1) {
		if (!remoteDevices.contains(arg0)) {
			remoteDevices.addElement(arg0);
		}
	}

	@Override
	public void inquiryCompleted(int arg0) {
		synchronized (lock) {
			lock.notify();
		}
		switch (arg0) {
		case DiscoveryListener.INQUIRY_COMPLETED:
			System.out.println("Inquiry Completed");
			break;
			
		case DiscoveryListener.INQUIRY_TERMINATED:
			System.out.println("Inquiry Terminated");
			break;
			
		case DiscoveryListener.INQUIRY_ERROR:
			System.out.println("Inquiry Error");
			break;
			
		default:
			System.out.println("Unknown Response Code");
			break;
		}
		
	}

	@Override
	public void serviceSearchCompleted(int arg0, int arg1) {
		synchronized (lock) {
			lock.notify();
		}
	}

	@Override
	public void servicesDiscovered(int arg0, ServiceRecord[] arg1) {
		if (!(arg1==null) && arg1.length > 0) {
			connectionUrl = arg1[0].getConnectionURL(0, false);
		}
	}

}