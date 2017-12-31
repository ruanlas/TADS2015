package teste;

public class Email {
	public static boolean validarEmail(String email) {
		boolean emailValido = false;
		int posicaoArroba = email.indexOf('@');
		int posicaoPonto1 = email.indexOf(".", posicaoArroba);
		int posicaoPonto2 = email.indexOf(".", posicaoPonto1+1);
		int posicaoPonto3 = email.indexOf(".", posicaoPonto2+1);
		
		if(posicaoPonto3 == -1 || posicaoPonto2 == -1){
			if(posicaoArroba > -1 && posicaoPonto1 > -1 && posicaoPonto2 > -1){
				if(!email.endsWith(".")){
					emailValido = true;
				}
			}else if (posicaoArroba > -1 && posicaoPonto1 > -1) {
				if (!email.endsWith(".")) {
					emailValido = true;
				}
			}
		}
		
		System.out.println(posicaoArroba +" "+ posicaoPonto1+" "+ posicaoPonto2+" "+posicaoPonto3);
		return emailValido;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Email.validarEmail("ruanlac@bbbbbb.b.b"));
	}
}
