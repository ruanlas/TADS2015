
public class Equacao2Grau {
	public static void calculoEquacao(int a, int b, int c) {
		double delta = Math.pow(b,2)- 4 *a*c;
		double X1 = (-b + Math.sqrt(delta)) / (2*a);
		double X2 = (-b - Math.sqrt(delta)) / (2*a);
		System.out.println("X1 = "+X1+ "\nX2 = "+X2);		
	}
}
