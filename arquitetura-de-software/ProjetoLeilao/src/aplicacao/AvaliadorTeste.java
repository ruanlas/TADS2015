package aplicacao;
import org.junit.Assert;
import org.junit.Test;

public class AvaliadorTeste {
	
	@Test
	public void testaLancesEmOrdemDecrescente() {
		Leilao leilao = new Leilao("Notebook");
		
		Usuario joao = new Usuario(1L, "João");
		Usuario maria = new Usuario(2L, "Maria");
		Usuario jose = new Usuario(3L, "José");
		
		leilao.addLance(new Lance(jose, 150.0));
		leilao.addLance(new Lance(joao, 100.0));
		leilao.addLance(new Lance(maria, 50.0));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avaliar(leilao);
		
//		System.out.println("Maior Lance " + avaliador.getMaiorLance());
//		System.out.println("Menor Lance " + avaliador.getMenorLance());
//		System.out.println("Média " + avaliador.getMedia());
		
		Assert.assertEquals(150.0, avaliador.getMaiorLance(),0.00001);
		Assert.assertEquals(50.0, avaliador.getMenorLance(), 0.00001);
		Assert.assertEquals(100.0, avaliador.getMedia(), 0.00001);
		
		
		
	}
}
