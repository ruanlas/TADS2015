package testes;

import others.SaidaCronometro;

public class OutraAcaoCronometro implements SaidaCronometro{

	//classe de teste
	@Override
	public void tique(int tempo) {
		System.out.println(tempo);
		
	}

	@Override
	public void tempoEncerrado() {
		System.out.println("Tempo Esgotado");
		
	}

}
