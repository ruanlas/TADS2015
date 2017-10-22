package br.com.minhaempresa.meuprojeto.repositorios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.minhaempresa.meuprojeto.entidades.Pessoa;

public class PessoaRepository {

	private final List<Pessoa> todasPessoas;

	public PessoaRepository() {
		todasPessoas = Arrays.asList(
				new Pessoa(1L, "Joao"),
				new Pessoa(2L, "Maria"),
				new Pessoa(3L, "Joel"),
				new Pessoa(4L, "Marta"));
	}

	public List<Pessoa> todas() {
		return Collections.unmodifiableList(todasPessoas);
	}

	public Pessoa comId(long id) {
		for (Pessoa p : todasPessoas) {
			if (id == p.getId()) return p;
		}

		return null;
	}

}
