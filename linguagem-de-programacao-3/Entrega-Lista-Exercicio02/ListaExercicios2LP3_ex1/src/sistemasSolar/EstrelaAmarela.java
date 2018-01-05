package sistemasSolar;

public class EstrelaAmarela extends ProtoEstrela{
	private String nome;
	public EstrelaAmarela(String nome, double temperatura, double luminosidade, double magnitude){
		super(temperatura, luminosidade, magnitude);
		this.nome = nome;
//		this.setLuminosidade(luminosidade);
//		this.setMagnitude(magnitude);
//		this.setTemperatura(temperatura);
	}
	@Override
	public String mostrarTipo() {
		return "Estrela Amarela";
	}
	@Override
	public String mostrarDados() {
		return  "Nome: "+ nome+"\n"+
				"Temperatura: "+this.getTemperatura()+"\n"+
				"Magnitude: "+this.getMagnitude()+"\n"+
				"Luminosidade: "+this.getLuminosidade()+"\n";
	}
}
