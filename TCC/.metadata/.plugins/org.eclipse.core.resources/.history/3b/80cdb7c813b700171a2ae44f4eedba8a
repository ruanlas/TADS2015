package scanner;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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

public class ELM327 {
	private OutputStream outStream;
	private InputStream inStream;
	
	public ELM327(InputStream inStream, OutputStream outStream) {
		this.outStream = outStream;
		this.inStream = inStream;
	}
	
	
	public void executeRpm() throws IOException, InterruptedException {
		RPMCommand object = new RPMCommand();
		object.run(inStream, outStream);
//		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeSpeed() throws IOException, InterruptedException {
		SpeedCommand object = new SpeedCommand();
		object.run(inStream, outStream);
//		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeFuelPressure() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		
		FuelPressureCommand object = new FuelPressureCommand();
		object.run(inStream, outStream);
//		medicao.carregarElemento(object.getFormattedResult());
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
//		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeFindFuelType() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		FindFuelTypeCommand  object = new FindFuelTypeCommand();
		object.run(inStream, outStream);
//		medicao.carregarElemento(object.getFormattedResult());
	}
	
	public void executeFuelLevel() throws IOException, InterruptedException {
		new ObdResetCommand().run(inStream, outStream);
		new EchoOffCommand().run(inStream, outStream);
		new HeadersOffCommand().run(inStream, outStream);
//		new SpacesOffCommand().run(inStream, outStream);
		new SelectProtocolCommand(ObdProtocols.AUTO).run(inStream, outStream);
		
		FuelLevelCommand object = new FuelLevelCommand();
		object.run(inStream, outStream);
//		medicao.carregarElemento(object.getFormattedResult());
	}
}
