import javax.bluetooth.L2CAPConnection;

public class OBDConnection {
	private L2CAPConnection input , output;
	
	public void setInputOutput(L2CAPConnection input, L2CAPConnection output) {
		this.input = input;
		this.output = output;
	}

	public L2CAPConnection getInput() {
		return input;
	}

	public void setInput(L2CAPConnection input) {
		this.input = input;
	}

	public L2CAPConnection getOutput() {
		return output;
	}

	public void setOutput(L2CAPConnection output) {
		this.output = output;
	}
}
