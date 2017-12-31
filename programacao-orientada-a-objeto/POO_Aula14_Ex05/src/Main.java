
public class Main {
	public static void main(String[] args) {
		CaixaDeGuardarTexto caixa = new CaixaDeGuardarTexto(5);
		
		caixa.guardarTexto("Hello World!!!!");
		System.out.println(caixa.obterTexto());
		
		caixa.guardarTexto("IBIRAPUERA");
		System.out.println(caixa.obterTexto());
		
		System.out.println();
	}
}
