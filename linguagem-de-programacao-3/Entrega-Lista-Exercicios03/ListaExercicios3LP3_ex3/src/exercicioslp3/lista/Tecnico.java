package exercicioslp3.lista;

public class Tecnico extends Assistente{
	private double bonus;
	public Tecnico(String matricula) {
		// TODO Auto-generated constructor stub
		super(matricula);
	}
	public Tecnico(String matricula, double bonus) {
		// TODO Auto-generated constructor stub
		super(matricula);
		this.bonus = bonus;
	}
	public Tecnico(String nome, double salario, int numeroDependente, String matricula, double bonus) {
		// TODO Auto-generated constructor stub
		super(nome, salario, numeroDependente, matricula);
		this.bonus = bonus;
	}
	@Override
	public void exibeDados() {
		System.out.println("Nome do Funcion�rio: "+this.getNome());
		System.out.println("Matr�cula: "+ this.getMatricula());
		System.out.println("Sal�rio: "+( this.getSalario()+bonus ));
		System.out.println("Numero dependete: "+this.getNumeroDependente());
	}
}
