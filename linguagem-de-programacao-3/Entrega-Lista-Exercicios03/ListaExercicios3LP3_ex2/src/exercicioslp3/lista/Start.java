package exercicioslp3.lista;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menu = 0;
		System.out.println("Selecione as op��es: ");
		System.out.println("1 - Im�vel Novo");
		System.out.println("2 - Im�vel Velho");
		menu = in.nextInt();
		in.nextLine();
		if (menu==1) {
			System.out.println("Im�vel Novo");
			Novo imNovo = new Novo("Rua americana, 123");
			imNovo.imprimeValor();
		}else if (menu==2) {
			System.out.println("Im�vel Velho");
			Velho imVelho = new Velho("Rua Iguatali, 432");
			imVelho.imprimeValor();
		}
	}
}
