package teste;
import java.io.*;
import java.util.Vector;
import javax.bluetooth.*;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.swing.*;

import com.github.pires.obd.commands.engine.OilTempCommand;


 public class Elmbtooth implements DiscoveryListener
 {  
 private static Object lock=new Object();

 private static Vector remdevices=new Vector();

private static String connectionURL=null;


public static void main(String args[]) throws IOException, InterruptedException
{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));

    Elmbtooth obj=new Elmbtooth();
    LocalDevice locdevice = LocalDevice.getLocalDevice();
    String add= locdevice.getBluetoothAddress();
    String friendly_name= locdevice.getFriendlyName();

    System.out.println("Local Bluetooth Address : "+add);
    System.out.println("" +
            "" +
            "Local Friendly name : "+friendly_name);

    DiscoveryAgent dis_agent= locdevice.getDiscoveryAgent();
    System.out.println("********Locating Devices******");
    dis_agent.startInquiry(DiscoveryAgent.GIAC,obj);
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

    }
    else
    {

        for(int i=0;i<remdevices.size();i++)
        {
            RemoteDevice remote_device=(RemoteDevice)remdevices.elementAt(i);
            System.out.println((i+1)+".)"+remote_device.getFriendlyName(true)+" "+remote_device.getBluetoothAddress());
        }
        System.out.println("Choose Device to establish SPP");
        int index=Integer.parseInt(b.readLine());

        RemoteDevice des_device=(RemoteDevice)remdevices.elementAt(index-1);
        UUID[] uuidset=new UUID[1];
        uuidset[0]=new UUID("1101",true);

        dis_agent.searchServices(null, uuidset, des_device, obj);
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

        if(connectionURL==null)
        {
            System.out.println("Device does not support SPP.");
        }
        else
        {
            System.out.println("Device supports SPP.");

            StreamConnection st_connect=(StreamConnection)Connector.open(connectionURL);
            OutputStream outStream=st_connect.openOutputStream();
            
            PrintWriter pWriter=new PrintWriter(new OutputStreamWriter(outStream));
            InputStream inStream=st_connect.openInputStream();
            BufferedReader in=new BufferedReader(new InputStreamReader(inStream));
            
            //Temperatura do óleo
            OilTempCommand oleo = new OilTempCommand();
            
            oleo.run(inStream, outStream);
            
            System.out.println(oleo.getResult());

//            pWriter.write("AT Z");
//            pWriter.flush();
//            pWriter.write("AT E0");
//            pWriter.flush();
//            pWriter.write("AT SP 00");
//            pWriter.flush();
//            pWriter.write("0100");
//            pWriter.flush();
//            String line=in.readLine();
//            System.out.print(line);
//            System.out.println("OOO");
//            pWriter.write("AT DP");
//            pWriter.flush();  
            System.out.println("OOOOO");
        }   


    }


}

    public void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod)
    {
        if(!remdevices.contains(btDevice))
        {
            remdevices.addElement(btDevice);
        }
    }       

@Override
public void servicesDiscovered(int transID, ServiceRecord[] servRecord)
{
    if(!(servRecord==null)&&servRecord.length>0)
    {
        connectionURL=servRecord[0].getConnectionURL(0, false);
    }


}
@Override
public void serviceSearchCompleted(int transID, int respCode) 
{
    synchronized(lock)
    {
        lock.notify();
    }

}
@Override
public void inquiryCompleted(int discType)
{
    synchronized(lock)
    {
        lock.notify();
    }
    switch(discType)
    {
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
    }
}


}