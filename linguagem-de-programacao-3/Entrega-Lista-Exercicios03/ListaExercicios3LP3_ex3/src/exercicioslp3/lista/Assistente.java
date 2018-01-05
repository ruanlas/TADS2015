package exercicioslp3.lista;

public class Assistente extends Funcionario{
	private String matricula;
	public Assistente(String matricula) {
		// TODO Auto-generated constructor stub
		this.matricula = matricula;
	}
	public Assistente(String nome, double salario, int numeroDependente, String matricula) {
		// TODO Auto-generated constructor stub
		super(nome, salario, numeroDependente);
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	@Override
	public void exibeDados() {
		System.out.println("Nome do Funcionário: "+this.getNome());
		System.out.println("Matrícula: "+ matricula);
		System.out.println("Salário: "+this.getSalario());
		System.out.println("Numero dependete: "+this.getNumeroDependente());
	}
}
