package licao.ifsp.lp3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> listaString = new HashSet<String>();
		String entrada = null;
		System.out.println("Digite as palavras: ");
		System.out.println("Caso deseje sair digite fim");
		do {
			entrada = in.nextLine().toUpperCase();
			listaString.add(entrada.toUpperCase());
		} while (!entrada.equals("fim".toUpperCase()));
		
		//Segunda Lista
		Set<String> listaString2 = new HashSet<String>();
		entrada = null;
		System.out.println("Digite novamente mais palavras: ");
		System.out.println("Caso deseje sair digite fim");
		do {
			entrada = in.nextLine().toUpperCase();
			listaString2.add(entrada.toUpperCase());
		} while (!entrada.equals("fim".toUpperCase()));
		
		for (String string2 : listaString2) {
			boolean foiLido = true;
	label1:for (String string : listaString) {
				if(string2.equals(string)){
					foiLido = true;
					break label1;
				}else {
					foiLido = false;
				}
			}
			if(foiLido){
				System.out.println(string2+"(L)");
			}else {
				System.out.println(string2+"(NL)");
			}
		}
		

		
	}
}
