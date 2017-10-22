package br.com.minhaempresa.meuprojeto.web.controller;

import static java.util.Arrays.asList;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class MinhaEntidadeController {

	private final Result result;

	public MinhaEntidadeController(Result result) {
		this.result = result;
	}

	public void ola() {
		result.include("mensagens", asList("Ola", "mundo!"));
	}

}
