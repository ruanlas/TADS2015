package ifsplp3.aula11;

public class Horista extends Empregado{
	private double salarioHora;
	private double salarioHoraExtra = salarioHora*1.5;
	private int horaTrabalhada;
	
	public Horista() {
		super();
	}
	public Horista(String nome, String sobrenome, String documento, double salarioHora, int horaTrabalhada) {
		super(nome, sobrenome, documento);
		this.salarioHora = salarioHora;
		this.horaTrabalhada = horaTrabalhada;
		this.salarioHoraExtra = this.salarioHora*1.5;
	}
	
	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}
	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = horaTrabalhada;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}


	@Override
	public double salario() {
		double calculoSalario = 0;
		if(this.horaTrabalhada <=40 ){
			calculoSalario = (double)this.horaTrabalhada*salarioHora;
		}else {
			int horaExtra = horaTrabalhada - 40;
			calculoSalario = 40*salarioHora;
			calculoSalario += (double) horaExtra*salarioHoraExtra;
		}
		return calculoSalario;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nHoras trabalhadas: %d horas\nSalário por hora: %.2f\nSalário Total: R$ %.2f", super.toString(), this.horaTrabalhada, this.salarioHora, this.salario());
	}
}
