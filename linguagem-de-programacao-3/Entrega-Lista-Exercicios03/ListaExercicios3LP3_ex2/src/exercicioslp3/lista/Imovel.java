package exercicioslp3.lista;

public class Imovel {
	public String endereco;
	public double preco;
	
	public Imovel(String endereco){
		this.endereco = endereco;
		preco = 100000.00;
	}
	public double preco() {
		return this.preco;
	}
}
