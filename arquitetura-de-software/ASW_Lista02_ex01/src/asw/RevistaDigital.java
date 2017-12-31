package asw;

public class RevistaDigital extends Revista{

	public RevistaDigital(double preco, Desconto desconto, String nomeRevista) {
		super(preco, desconto, nomeRevista);
		setString("Nome da Revista Digital: ");
	}

}
