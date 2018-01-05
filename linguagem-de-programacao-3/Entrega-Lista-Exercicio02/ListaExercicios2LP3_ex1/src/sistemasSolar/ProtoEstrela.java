package sistemasSolar;

public class ProtoEstrela {
	private double temperatura;
	private double magnitude;
	private double luminosidade;
	
	public ProtoEstrela(double temperatura, double luminosidade, double magnitude){
		this.luminosidade = luminosidade;
		this.magnitude = magnitude;
		this.temperatura = temperatura;
//		this.temperatura = 0;
//		this.magnitude = 0;
//		this.luminosidade = 0;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}
	public double getLuminosidade() {
		return luminosidade;
	}
	public void setLuminosidade(double luminosidade) {
		this.luminosidade = luminosidade;
	}
	public String mostrarTipo() {
		return "Proto Estrela";
	}
	public String mostrarDados() {
		return "Temperatura: "+temperatura+"\n"+
				"Magnitude: "+magnitude+"\n"+
				"Luminosidade: "+luminosidade+"\n";
	}
	public String toString() {
		return this.mostrarTipo()+"\n"+
			   this.mostrarDados();
	}
}
