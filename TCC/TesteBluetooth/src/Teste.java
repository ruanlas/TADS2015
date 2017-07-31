import obd.commands.fuel.AirFuelRatioCommand;
import obd.commands.protocol.ObdResetCommand;

public class Teste {
	public static void main(String[] args) {
		AirFuelRatioCommand ar = new AirFuelRatioCommand();
		System.out.println(ar.getCommandMode());
		System.out.println(ar.getCommandPID());
	}
}
