
public class Teste {
	public static void main(String[] args) {
		Financiamento finan;
		
//		finan = new FinanciamentoCarro();
//		
//		
//		finan.inserirValorDoBem(45000.00);
//		try {
//			finan.inserirValorEntrada(2000.00);
//		} catch (ExceptionEntradaInsuficiente e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finan.inserirQuantidadeDeParcelas(4);
//		finan.inserirRendaLiquidaMensal(400);
//		finan.calcular();
//		
//		System.out.println(finan.getValorFinalCadaParcela());
//		System.out.println(finan.getValorFinalBem());
		
		finan = new FinanciamentoImovel();
		
		finan.inserirValorDoBem(45000.00);
		try {
			finan.inserirValorEntrada(9000.00);
		} catch (ExceptionEntradaInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finan.inserirQuantidadeDeParcelas(4);
		finan.inserirRendaLiquidaMensal(400);
		finan.calcular();
		
		System.out.println(finan.getValorFinalCadaParcela());
		System.out.println(finan.getValorFinalBem());
		
	}
}
