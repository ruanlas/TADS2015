package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo_aula.Negociacao;

public class TesteNegociacao {
	
	private Negociacao neg;
	
	public TesteNegociacao() {
		neg = new Negociacao(9.7, 5, null);
	}
	
	@Test
	public void testGetQuantidade() {
		assertEquals("Houve o retorno de uma quantidade inesperada", 5, neg.getQuantidade());
	}
	@Test
	public void	testGetVolume(){
		assertEquals("Houve o retorno de um valor inesperado", (neg.getQuantidade()*neg.getPreco()), neg.getVolume(), 0.00001);
	}
	@Test
	public void testeData() {
		assertEquals("Houve o retorno de uma data inesperada", null, neg.getData());
	}

}
