package device;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
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

import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.engine.OilTempCommand;
import com.github.pires.obd.commands.engine.RPMCommand;
import com.github.pires.obd.commands.fuel.FindFuelTypeCommand;
import com.github.pires.obd.commands.fuel.FuelLevelCommand;
import com.github.pires.obd.commands.pressure.FuelPressureCommand;
import com.github.pires.obd.commands.protocol.EchoOffCommand;
import com.github.pires.obd.commands.protocol.HeadersOffCommand;
import com.github.pires.obd.commands.protocol.ObdResetCommand;
import com.github.pires.obd.commands.protocol.SelectProtocolCommand;
import com.github.pires.obd.enums.ObdProtocols;

import bluetooth_connect.ConnectionBluetoothFactory;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import utils.CarregarElementoVisual;

public class DiscoveryDevices implements DiscoveryListener {
	
	private Object lock = new Object();
	private Vector remoteDevices = new Vector();
	private LocalDevice localDevice;
	private DiscoveryAgent discoveryAgent;
	private StreamConnection objectConnection;
	private OutputStream outStream;
	private InputStream inStream;
	private String connectionUrl;
//	//@FXML
//	private ComboBox cBoxDeviceSelect;
//	//@FXML
//	private Label lblMedicao, lblStConnect;
	private CarregarElementoVisual deviceSelect, medicao, statusConnect;
	
	
	public void carregarComponentes(CarregarElementoVisual deviceSelect, 
			CarregarElementoVisual medicao, CarregarElementoVisual statusConnect) {
		this.deviceSelect = deviceSelect;
		this.medicao = medicao;
		this.statusConnect = statusConnect;
	}
	
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
			statusConnect.carregarElemento("No Devices found");
		}else {
			ArrayList<String> list = new ArrayList();
			
			for (int i = 0; i < remoteDevices.size(); i++) {
				
				RemoteDevice remote_device = (RemoteDevice)remoteDevices.elementAt(i);
				System.out.println((i+1) + ".)" + remote_device.getFriendlyName(true)+ " " + remote_device.getBluetoothAddress());
				list.add((i+1) + ".)" + remote_device.getFriendlyName(true)+ " " + remote_device.getBluetoothAddress());
			}
			if(!list.isEmpty()){
				deviceSelect.carregarElemento(list);
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
			statusConnect.carregarElemento("Device does not support SPP.");
		}else {
			System.out.println("Device supports SPP.");
			statusConnect.carregarElemento("Device supports SPP.");
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
			statusConnect.carregarElemento("Inquiry Completed");
			break;
			
		case DiscoveryListener.INQUIRY_TERMINATED:
			System.out.println("Inquiry Terminated");
			statusConnect.carregarElemento("Inquiry Terminated");
			break;
			
		case DiscoveryListener.INQUIRY_ERROR:
			System.out.println("Inquiry Error");
			statusConnect.carregarElemento("Inquiry Error");
			break;
			
		default:
			System.out.println("Unknown Response Code");
			statusConnect.carregarElemento("Device supports SPP.");
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
	
	public void executeRpm() throws IOException, InterruptedException {
		RPMCommand object = new RPMCommand();
		object.run(inStream, outStream);
		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeSpeed() throws IOException, InterruptedException {
		SpeedCommand object = new SpeedCommand();
		object.run(inStream, outStream);
		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeFuelPressure() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		
		FuelPressureCommand object = new FuelPressureCommand();
		object.run(inStream, outStream);
		medicao.carregarElemento(object.getFormattedResult());
	}
	
	///Novo daqui para baixo
	
	public void executeOilTemp() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		OilTempCommand object = new OilTempCommand();
		object.run(inStream, outStream);
		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeFindFuelType() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		FindFuelTypeCommand  object = new FindFuelTypeCommand();
		object.run(inStream, outStream);
		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeFuelLevel() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		FuelLevelCommand object = new FuelLevelCommand();
		object.run(inStream, outStream);
		medicao.carregarElemento(object.getFormattedResult());
	}
}
