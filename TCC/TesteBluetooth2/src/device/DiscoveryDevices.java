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

import connect.ConnectionFactory;
import obd.commands.control.DistanceMILOnCommand;
import obd.commands.control.DistanceSinceCCCommand;
import obd.commands.engine.RPMCommand;
import obd.commands.pressure.FuelPressureCommand;
import utils.PreencherElementoVisual;

public class DiscoveryDevices implements DiscoveryListener{

	private Object lock=new Object();
	private Vector remdevices=new Vector();
	private LocalDevice localDevice;
	private DiscoveryAgent discoveryAgent;
	private StreamConnection objectConnection;
	private OutputStream outStream;
	private InputStream inStream;
	private String connectionUrl;
	
	private PreencherElementoVisual comboBox, labelStatus, labelMedicao;
	
	public void setComponentes(PreencherElementoVisual combobox, PreencherElementoVisual labelStatus,
			PreencherElementoVisual labelMedicao) {
		
		this.comboBox = combobox;
		this.labelStatus = labelStatus;
		this.labelMedicao = labelMedicao;
	}
	
	public void run() throws BluetoothStateException, IOException {
		localDevice = LocalDevice.getLocalDevice();
		discoveryAgent = localDevice.getDiscoveryAgent();
		this.refreshList();
	}
	public void refreshList() throws IOException {
		if (objectConnection != null) {
			objectConnection.close();
		}
		discoveryAgent.startInquiry(DiscoveryAgent.GIAC, this);
		try
	    {

	        synchronized (lock)
	            {
	                lock.wait();
	            }
	    }
	    catch(InterruptedException e)
	    {
	        e.printStackTrace();
	    }

	    if(remdevices.size()<=0)
	    {
	        System.out.println("No devices found");
	        labelStatus.carregarElemento("No devices found");

	    }
	    else
	    {

	        for(int i=0;i<remdevices.size();i++)
	        {
	            RemoteDevice remote_device=(RemoteDevice)remdevices.elementAt(i);
	            System.out.println((i+1)+".)"+remote_device.getFriendlyName(true)+" "+remote_device.getBluetoothAddress());
	            //Adicionar os elementos no ComboBox
	            comboBox.carregarElemento((i+1)+".)"+remote_device.getFriendlyName(true)+" "+remote_device.getBluetoothAddress());
	        }

	    }
	}
	
	public void executeRPM() throws IOException, InterruptedException {
		
		RPMCommand object = new RPMCommand();
        
        object.run(inStream, outStream);
        
        //mostrar na label
//        object.getFormattedResult();
        labelMedicao.carregarElemento(object.getFormattedResult());
	}
	
	public void outrasMedicoes() throws IOException, InterruptedException {
		DistanceSinceCCCommand obj = new DistanceSinceCCCommand();
		obj.run(inStream, outStream);
		labelMedicao.carregarElemento(obj.getFormattedResult());
		
//		DistanceMILOnCommand obj = new DistanceMILOnCommand(); //OK, Funcionou!!
//		obj.run(inStream, outStream);
//		labelMedicao.carregarElemento(obj.getFormattedResult());
	}
	
	public void executeFuelPressure() throws IOException, InterruptedException {
		FuelPressureCommand object = new FuelPressureCommand();
		object.run(inStream, outStream);
		labelMedicao.carregarElemento(object.getFormattedResult());
	}
	
	public void connectToDevice(int index) throws BluetoothStateException, IOException {
		RemoteDevice des_device=(RemoteDevice)remdevices.elementAt(index);
        UUID[] uuidset=new UUID[1];
        uuidset[0]=new UUID("1101",true);

        discoveryAgent.searchServices(null, uuidset, des_device, this);
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

        if(connectionUrl==null)
        {
            System.out.println("Device does not support SPP.");
            labelStatus.carregarElemento("Device does not support SPP.");
        }
        else
        {
            System.out.println("Device supports SPP.");
            objectConnection = ConnectionFactory.getConnectionBluetooth(connectionUrl);
            outStream = objectConnection.openOutputStream();
    		inStream = objectConnection.openInputStream();
            labelStatus.carregarElemento("Device supports SPP.");
        }
	}
	
	@Override
	public void deviceDiscovered(RemoteDevice device, DeviceClass dClass) {
		// TODO Auto-generated method stub
		if(!remdevices.contains(device))
        {
            remdevices.addElement(device);
        }
	}
	
	@Override
	public void inquiryCompleted(int discType) {
		// TODO Auto-generated method stub
	    synchronized(lock)
	    {
	        lock.notify();
	    }
	    switch(discType)
	    {
	    case DiscoveryListener.INQUIRY_COMPLETED:
	        System.out.println("Inquiry Completed");
	        labelStatus.carregarElemento("Inquiry Completed");
	        break;

	    case DiscoveryListener.INQUIRY_TERMINATED:
	        System.out.println("Inquiry Terminated");
	        labelStatus.carregarElemento("Inquiry Terminated");
	        break;

	    case DiscoveryListener.INQUIRY_ERROR:
	        System.out.println("Inquiry Error");
	        labelStatus.carregarElemento("Inquiry Error");
	        break;

	    default:
	        System.out.println("Unknown Response Code");
	        labelStatus.carregarElemento("Unknown Response Code");
	    }
	}

	@Override
	public void serviceSearchCompleted(int arg0, int arg1) {
		// TODO Auto-generated method stub
		synchronized(lock)
	    {
	        lock.notify();
	    }
	}

	@Override
	public void servicesDiscovered(int transID, ServiceRecord[] serviceRecord) {
		// TODO Auto-generated method stub
		if(!(serviceRecord==null)&&serviceRecord.length>0)
	    {
	        connectionUrl=serviceRecord[0].getConnectionURL(0, false);
	    }
	}
	

}
