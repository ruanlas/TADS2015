package exercicioslp3.lista;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Vip vip = new Vip();
		Ingresso ingresso = new Ingresso();
		Normal normal = new Normal();
		CamaroteInferior camaroteInferior = new CamaroteInferior();
		CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
//		
//		System.out.println("Classe Ingresso");
//		ingresso.imprimeValor();
//		System.out.println();
//		System.out.println("Classe VIP");
//		vip.imprimeValor();
//		System.out.println();
//		System.out.println("Classe Normal");
//		normal.imprime();
//		normal.imprimeValor();
//		System.out.println();
//		System.out.println("Classe CamaroteInferior");
//		camaroteInferior.imprimeLocalizacao();
//		camaroteInferior.imprimeValor();
//		System.out.println();
//		System.out.println("Classe CamaroteSuperior");
//		camaroteSuperior.imprimeValor();
		Scanner in = new Scanner(System.in);
		int menu = 0;
		System.out.println("Digite as opções de Ingresso abaixo: ");
		System.out.println("1 - Ingresso Normal");
		System.out.println("2 - Ingresso VIP");
		menu = in.nextInt();
		in.nextLine();
		if(menu==1){
			normal.imprime();
			normal.imprimeValor();
		}else if(menu==2) {
			int menu2 = 0;
			System.out.println();
			System.out.println("Digite as opções: ");
			System.out.println("1 - Camarote Superior");
			System.out.println("2 - Camarote Inferior");
			menu2 = in.nextInt();
			in.nextLine();
			if (menu2==1) {
				System.out.println("Camarote Superior:");
				camaroteSuperior.imprimeValor();
			}else if (menu2==2) {
				System.out.println("Camarote Inferior: ");
				camaroteInferior.imprimeValor();
			}
		}
	}
}
