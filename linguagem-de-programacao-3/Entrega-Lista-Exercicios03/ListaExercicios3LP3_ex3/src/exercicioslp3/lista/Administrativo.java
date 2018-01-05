package exercicioslp3.lista;

public class Administrativo extends Assistente{
	private String turno;
	private double adicionalNoturno;
	public Administrativo(String matricula) {
		// TODO Auto-generated constructor stub
		super(matricula);
	}
	public Administrativo(String matricula, String turno, double adicionalNoturno) {
		// TODO Auto-generated constructor stub
		super(matricula);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
	}
	public Administrativo(String nome, double salario, int numeroDependente, String matricula, String turno, double adicionalNoturno) {
		// TODO Auto-generated constructor stub
		super(nome, salario, numeroDependente, matricula);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
	}
	@Override
	public void exibeDados() {
		System.out.println("Nome do Funcionário: "+this.getNome());
		System.out.println("Matrícula: "+ this.getMatricula());
		System.out.println("Turno: "+turno);
		System.out.println("Salário: "+( this.getSalario()+adicionalNoturno ));
		System.out.println("Numero dependete: "+this.getNumeroDependente());
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
}
