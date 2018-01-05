package ifsp.exercicios.lp3;

import java.util.ArrayList;
import java.util.Scanner;

public class StartAnimais {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
		String menu = "9";
		while (!menu.equals("0")) {
			System.out.println("Digite uma das opções abaixo:");
			System.out.println("------------------------------");
			System.out.println("1 - Cadastro de Animais");
			System.out.println("2 - Cadastro de Mamíferos");
			System.out.println("3 - Cadastro de Peixes");
			System.out.println("0 - Sair");
			menu = in.nextLine();
			switch (menu) {
			case "1":
			{
				System.out.println("Digite o nome do animal: ");
				String nome = in.nextLine();
				System.out.println("Digite a cor do animal: ");
				String cor = in.nextLine();
				System.out.println("Digite o ambiente em que este animal vive: ");
				String ambiente = in.nextLine();
				System.out.println("Digite o comprimento deste animal em cm: ");
				int comprimento = in.nextInt();
				System.out.println("Digite a velocidade do animal em m/s: ");
				double velocidade = in.nextDouble();
				System.out.println("Digite a quantidade de patas que este animal possui: ");
				int patas = in.nextInt();
				
				Animal animal = new Animal(nome, cor, ambiente, comprimento, velocidade, patas);
				listaAnimais.add(animal);
				in.nextLine();
			}
				break;
			case "2":
			{
				System.out.println("Digite o nome do mamífero: ");
				String nome = in.nextLine();
				System.out.println("Digite a cor do mamífero: ");
				String cor = in.nextLine();
				System.out.println("Digite o ambiente em que este mamífero vive: ");
				String ambiente = in.nextLine();
				System.out.println("Digite o comprimento deste mamífero em cm: ");
				int comprimento = in.nextInt();
				System.out.println("Digite a velocidade do mamífero em m/s: ");
				double velocidade = in.nextDouble();
				System.out.println("Digite a quantidade de patas que este mamífero possui: ");
				int patas = in.nextInt();
				in.nextLine();
				System.out.println("Digite o alimento principal deste mamífero: ");
				String alimento = in.nextLine();
				
				Mamifero mamifero = new Mamifero(nome, cor, ambiente, comprimento, velocidade, patas, alimento);
				listaAnimais.add(mamifero);
			}
				break;
			case "3":
			{
				System.out.println("Digite o nome do peixe: ");
				String nome = in.nextLine();
				System.out.println("Digite a cor do peixe: ");
				String cor = in.nextLine();
				System.out.println("Digite o ambiente em que este peixe vive: ");
				String ambiente = in.nextLine();
				System.out.println("Digite o comprimento deste peixe em cm: ");
				int comprimento = in.nextInt();
				System.out.println("Digite a velocidade do peixe em m/s: ");
				double velocidade = in.nextDouble();
				in.nextLine();
				System.out.println("Digite a(s) característica(s) deste peixe: ");
				String caracteristica = in.nextLine();
				
				Peixe peixe = new Peixe(nome, cor, ambiente, comprimento, velocidade, caracteristica);
				listaAnimais.add(peixe);
			}
				break;
			case "0":
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		System.out.println("Resultado dos animais cadastrados: ");
		System.out.println("---------------------------------------");
		for (Animal animal : listaAnimais) {
			animal.dados();
		}
		
	}
}
