
public class Start {
	public static void main(String[] args) {
		CalculadoraInstancia calculadora = new CalculadoraInstancia();
		
		System.out.println(calculadora.divisao(5, 2));
		System.out.println(calculadora.soma(2, 3));
		System.out.println(calculadora.multiplicar(8, 2));
		System.out.println(calculadora.subtrair(3, 6));
	}
}
