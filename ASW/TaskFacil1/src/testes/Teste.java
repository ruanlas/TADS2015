package testes;

import others.Criptografar;
import others.Email;

public class Teste {
	public static void main(String[] args) {
		//teste validacao email
		String email;
		email = "nc-df.09??cs@gmail.com.br.nb";
		String regex = "\\w{1,}((\\.|-)\\w{1,})*@\\w{2,}\\.\\w{2,}(\\.\\w{2,4})?"; //Mais confiável
		String regex2 = ".{1,}@\\w{2,}\\.\\w{2,}(\\.\\w{2,4})?";
		//email.matches(regex);
//		System.out.println(email.matches("^[\\w\\.-]+@([\\w\\-]+\\.)+[a-z]{2,4}$"));
		System.out.println(email.matches(regex));
		System.out.println(email.matches(regex2));
		System.out.println("dd---".matches(".{1,}"));
		
		System.out.println(Criptografar.codificar("O"));
		System.out.println(Criptografar.codificar("O"));
		System.out.println(Email.isEmail("ruan.luiz@gmail.com"));
	}
}
