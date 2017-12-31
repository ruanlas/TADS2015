import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c;
		System.out.println("Cálculo de equação do segundo grau aX²+bX+c = 0");
		System.out.println("Digite um valor para o coef. a");
		a = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite um valor para o coef. b");
		b = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite um valor para o coef. c");
		c = entrada.nextInt();
		entrada.nextLine();
		//Utilizar para teste a = 1; b = 5; c = 6
		//X² + 5X + 6 = 0
		System.out.println("Equação:");
		System.out.println(a+"X² + "+b+"X + "+c+" = 0");
		System.out.println("Resultado:");
		Equacao2Grau.calculoEquacao(a, b, c);
		
	}
}
