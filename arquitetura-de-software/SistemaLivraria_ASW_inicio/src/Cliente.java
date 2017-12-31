import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Pessoa{
	private String tipoCliente;
	
	public Cliente(String tipoCliente, String nome, Date dataNascimento, long cpf, String rg, Endereco endereco, ArrayList<String> telefones,
			String email) {
		super(nome, dataNascimento, cpf, rg, endereco, telefones, email);
		this.tipoCliente = tipoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
}
