
public class Start {
	public static void main(String[] args) {
		Carteira minhaCarteira = new Carteira(200.00);
		System.out.println(minhaCarteira.podePagar(200.01));
		System.out.println(minhaCarteira.podePagar(200.00));
	}
}
