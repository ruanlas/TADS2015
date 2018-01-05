package ifsp.aula.lp3;

public class Gerente extends Funcionario{
	
	private int senha;
	private int quantidadeDeSubordinados;
	
	@Override //do método getBonus() da classe mãe 'Funcionario'
	public double getBonus() {
		return this.salario * 0.15;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getQuantidadeDeSubordinados() {
		return quantidadeDeSubordinados;
	}
	public void setQuantidadeDeSubordinados(int quantidadeDeSubordinados) {
		this.quantidadeDeSubordinados = quantidadeDeSubordinados;
	}
	
}
