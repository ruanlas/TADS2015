import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Vector;

import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

public class TesteConexao2 {
	public static final Vector<RemoteDevice> devicesDiscovered = new Vector();
	
	private static L2CAPConnection output, input;
	private static String urlConnection = null;
	
    public static void main(String[] args) throws IOException, InterruptedException {

        final Object inquiryCompletedEvent = new Object();

        devicesDiscovered.clear();

        DiscoveryListener listener = new DiscoveryListener() {

            public void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod) {
                System.out.println("Device " + btDevice.getBluetoothAddress() + " found");
                devicesDiscovered.addElement(btDevice);
                try {
                    System.out.println("     name " + btDevice.getFriendlyName(false));
                } catch (IOException cantGetDeviceName) {
                }
            }
            

            public void inquiryCompleted(int discType) {
                System.out.println("Device Inquiry completed!");
                synchronized(inquiryCompletedEvent){
                    inquiryCompletedEvent.notifyAll();
                }
            }

            public void serviceSearchCompleted(int transID, int respCode) {
            }

            public void servicesDiscovered(int transID, ServiceRecord[] servRecord) {
                if(!(servRecord==null)&&servRecord.length>0)
                {
                    urlConnection = servRecord[0].getConnectionURL(0, false);
                }
            }
        };
        
        synchronized(inquiryCompletedEvent) {
            boolean started = LocalDevice.getLocalDevice().getDiscoveryAgent().startInquiry(DiscoveryAgent.GIAC, listener);
            if (started) {
                System.out.println("wait for device inquiry to complete...");
                inquiryCompletedEvent.wait();
                System.out.println(devicesDiscovered.size() +  " device(s) found");
            }
//            conectar();
        }
        
    }
    public static void conectar() throws IOException {
		StreamConnection stConnection = (StreamConnection)Connector.open(urlConnection);
//		stConnection.
	}
//    public static void conectar() throws IOException {
//    	Connector conn = null;
//		for (RemoteDevice object : devicesDiscovered) {
//			String nomeObjeto = object.getFriendlyName(false);
//			if (nomeObjeto.equals("OBDII")) {
////				conn = (Connector) Connector.open(object.getFriendlyName(true));
//				input = (L2CAPConnection) Connector.open(object.getFriendlyName(false));
//				System.out.println(object.getFriendlyName(false));
//				
//			}
//		}
//		System.out.println("Conectado com sucesso!!");
////		System.out.println(conn.toString());
//	}
}
