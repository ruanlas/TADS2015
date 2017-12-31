import java.util.ArrayList;
import java.util.Date;

public abstract class Funcionario extends Pessoa{
	private AcaoUsuario acaoUsuario;
	private String matricula;
	
	public Funcionario(){
		super();
	}
	
	public Funcionario(String nome, Date dataNascimento, long cpf, String rg, Endereco endereco, ArrayList<String> telefones,
			String email, AcaoUsuario acaoUsuario, String matricula) {
		super(nome, dataNascimento, cpf, rg, endereco, telefones, email);
		this.acaoUsuario = acaoUsuario;
		this.matricula = matricula;
	}
}
