package scanner;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.UUID;
import javax.microedition.io.StreamConnection;

import bluetooth.BluetoothConnection;
import bluetooth.DiscoveryDevices;

public class ConnectToDevice {
	private DiscoveryDevices discoveryDevices;
	private DiscoveryAgent discoveryAgent;
	private Vector remoteDevices;
	private Object lock;
	private String connectionUrl;
	
	public ConnectToDevice() {
		discoveryDevices = new DiscoveryDevices();
		discoveryAgent = discoveryDevices.getDiscoveryAgent();
		remoteDevices = discoveryDevices.getRemoteDevices();
		lock = discoveryDevices.getLock();
		connectionUrl = discoveryDevices.getConnectionUrl();
	}
	
	public ELM327 connectToDevice(int index) throws IOException {
		ELM327 scanner = null;
		RemoteDevice des_device=(RemoteDevice)remoteDevices.elementAt(index);
        UUID[] uuidset=new UUID[1];
        uuidset[0]=new UUID("1101",true);

        discoveryAgent.searchServices(null, uuidset, des_device, discoveryDevices);
        try
        {
            synchronized(lock)
            {
                lock.wait();
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        if(connectionUrl == null)
        {
            System.out.println("Device does not support SPP.");
        }
        else
        {
            System.out.println("Device supports SPP.");
            StreamConnection objectConnection = BluetoothConnection.getConnectionBluetooth(connectionUrl);
            OutputStream outStream = objectConnection.openOutputStream();
    		InputStream inStream = objectConnection.openInputStream();
    		scanner = new ELM327(inStream, outStream);
        }
		return scanner;
	}
}