package br.com.minhaempresa.meuprojeto.servicos;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.minhaempresa.meuprojeto.entidades.Pessoa;
import br.com.minhaempresa.meuprojeto.repositorios.PessoaRepository;

@Path("/pessoa")
public class PessoaService {

	private PessoaRepository pessoas = new PessoaRepository();

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Pessoa> todas() {
		return pessoas.todas();
	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Pessoa comId(@PathParam("id") long id) {
		return pessoas.comId(id);
	}

}
