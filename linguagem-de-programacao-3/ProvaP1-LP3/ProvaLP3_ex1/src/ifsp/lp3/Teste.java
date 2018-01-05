package ifsp.lp3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void menu() {
		System.out.println("Escolha as opções: ");
		System.out.println("1 - Segmento de reta");
		System.out.println("2 - Triângulo");
		System.out.println("3 - Retângulo");
		System.out.println("4 - Circulo");
		System.out.println("5 - Finaliza a inclusão de formas geométricas");
	}
	public static void main(String[] args) {
		ArrayList<FormaGeometrica> formasGeometricas = new ArrayList<FormaGeometrica>();
		Scanner in = new Scanner(System.in);
		int intMenu = 0;
		
		do{
			menu();
			intMenu = in.nextInt();
			switch (intMenu) {
			case 1:
			{
				FormaGeometrica objeto = new FormaGeometrica();
				formasGeometricas.add(objeto);
				System.out.println("Segmento de Reta Criado com Sucesso!!");
			}
				break;
			case 2:
			{
				System.out.println("Digite a medida da base do Triangulo: ");
				double base = in.nextDouble();
				System.out.println("Digite a medida da altura do Triangulo: ");
				double altura = in.nextDouble();
				Triangulo objeto = new Triangulo(base, altura);
				formasGeometricas.add(objeto);
				System.out.println("Triangulo criado com sucesso!!");
				in.nextLine();
			}
				break;
			case 3:
			{
				System.out.println("Digite a medida da base do Retangulo: ");
				double base = in.nextDouble();
				System.out.println("Digite a medida da altura do Retangulo: ");
				double altura = in.nextDouble();
				Retangulo objeto = new Retangulo(base, altura);
				formasGeometricas.add(objeto);
				System.out.println("Retangulo criado com sucesso!!");
				in.nextLine();
			}
				break;
			case 4:
			{
				System.out.println("Digite a medida do raio do Círculo: ");
				double raio = in.nextDouble();
				Circulo objeto = new Circulo(raio);
				formasGeometricas.add(objeto);
				System.out.println("Retangulo criado com sucesso!!");
				in.nextLine();
			}
				break;
			case 5:
			{
				System.out.println("Instrução Finalizada!");
			}
				break;

			default:
			{
				System.out.println("Opção Inválida");
			}
				break;
			}
		}while(intMenu!=5);
		
		for (FormaGeometrica formas : formasGeometricas) {
			if (formas.calculaArea() > 4) {
				if(formas.getNomeDaForma().equals("Retângulo")){
					((Retangulo) formas).desenharForma();
				}
				if(formas.getNomeDaForma().equals("Triangulo")){
					((Triangulo) formas).desenharForma();
				}
				if(formas.getNomeDaForma().equals("Círculo")){
					((Circulo) formas).desenharForma();
				}
			}
		}
		
	}
}
