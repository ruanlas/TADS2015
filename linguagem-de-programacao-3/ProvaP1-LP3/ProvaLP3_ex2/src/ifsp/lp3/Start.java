package ifsp.lp3;


public class Start {
	public static void main(String[] args) {
		String[] vetorString = {"Tiago", "Xavier", "Adelaide", "Bianca" };

		String primeiroNome = "ZZZZ";
		String ultimoNome = "AAAA";
		
		for (String string : vetorString) {
			if (string.toUpperCase().charAt(0) < primeiroNome.toUpperCase().charAt(0)) {
				primeiroNome = string;
			}else {
				primeiroNome = primeiroNome;
			}
			
			if (string.toUpperCase().charAt(0) > ultimoNome.toUpperCase().charAt(0)) {
				ultimoNome = string;
			}else {
				ultimoNome = ultimoNome;
			}
		}
		
		System.out.println("Primeiro Nome: "+ primeiroNome);
		System.out.println("Ultimo Nome: "+ ultimoNome);
	}
}
