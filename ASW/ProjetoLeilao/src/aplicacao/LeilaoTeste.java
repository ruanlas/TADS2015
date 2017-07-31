package aplicacao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeilaoTeste {
	private Leilao leilao;
	private Usuario joao, maria, jose;
	
	@Before
	public void inicializar() {
		leilao = new Leilao("Notebook");
		
		joao = new Usuario(1L, "joão");
		maria = new Usuario(2L, "Maria");
	}
	
	@Test
	public void testaLancesSeguidosDeUmMesmoUsuario() {
//		Leilao leilao = new Leilao("Notebook");
//		
//		Usuario joao = new Usuario(1L, "joão");
		leilao.addLance(new Lance(joao, 100.0));
		leilao.addLance(new Lance(joao, 200.0));
		
		Assert.assertEquals(1, leilao.getLances().size());
		Assert.assertEquals(100.0, leilao.getLances().get(0).getValor(), 0.0001);
		
	}
	
	@Test
	public void testaQtdDeLancesPorUsuario() {
//		Leilao leilao = new Leilao("Notebook");
//		
//		Usuario joao = new Usuario(1L, "joão");
//		Usuario maria = new Usuario(2L, "maria");
		
		leilao.addLance(new Lance(joao, 1.0));
		leilao.addLance(new Lance(maria, 2.0));
		leilao.addLance(new Lance(joao, 3.0));
		leilao.addLance(new Lance(maria, 4.0));
		leilao.addLance(new Lance(joao, 5.0));
		leilao.addLance(new Lance(maria, 6.0));
		leilao.addLance(new Lance(joao, 7.0));
		leilao.addLance(new Lance(maria, 8.0));
		leilao.addLance(new Lance(joao, 9.0));
		leilao.addLance(new Lance(maria, 10.0));
		leilao.addLance(new Lance(joao, 11.0));
		leilao.addLance(new Lance(maria, 12.0));
		
		Assert.assertEquals(10, leilao.getLances().size());
		Assert.assertEquals(10.0, leilao.ultimoLance().getValor(), 0.00001);
		
	}
}
