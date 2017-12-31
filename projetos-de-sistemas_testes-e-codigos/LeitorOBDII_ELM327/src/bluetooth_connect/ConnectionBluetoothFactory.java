package bluetooth_connect;

import java.io.IOException;

import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

public class ConnectionBluetoothFactory {
	private static StreamConnection stConnection;
	
	public static StreamConnection getConnectionBluetooth(String connectionUrl) throws IOException {
		stConnection = (StreamConnection)Connector.open(connectionUrl);
		return stConnection;
	}
}
