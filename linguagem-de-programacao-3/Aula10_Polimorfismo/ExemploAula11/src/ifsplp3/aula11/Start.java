package ifsplp3.aula11;

public class Start {
	public static void main(String[] args) {
		Horista eH = new Horista("Pedro", "Oliveira", "43277532", 4.5, 41);
		Assalariado eA = new Assalariado("João", "Paulo", "46325335", 600.70);
		Comissionado eC = new Comissionado("Maria", "Oliveira", "53287294", 4, 200.00);
		ComissionadoAssalariado eCA = new ComissionadoAssalariado("Carlos", "Augusto", "34327542", 4, 200.00, 800.00);
		
//		System.out.println(eH);
//		System.out.println();
//		System.out.println(eA);
//		System.out.println();
//		System.out.println(eC);
//		System.out.println();
//		System.out.println(eCA);
		System.out.println(String.format("%.2f", eA.salario()));
		System.out.printf("%.2f\n", eH.salario());
		System.out.printf("%.2f\n", eC.salario());
		System.out.println(String.format("%.2f", eCA.salario()));
		
		Empregado vetor[] = new Empregado[4];
		vetor[0] = eA;
		vetor[1] = eH;
		vetor[2] = eC;
		vetor[3] = eCA;
		
		System.out.println("\nProcessando polimorficamente\n");
		
		for (Empregado atual : vetor) {
			System.out.println(atual);
			System.out.println();
			//verifica se o objeto atual pertence à classe ComissionadoAssalariado
			if (atual instanceof ComissionadoAssalariado) {
				//Aplica o bônus de 10%
  				//((ComissionadoAssalariado) atual).setSalarioFixo(((ComissionadoAssalariado) atual).getSalarioFixo() * 1.1);
 				//System.out.println(atual);
				//ou
				ComissionadoAssalariado temp = (ComissionadoAssalariado) atual;
				temp.setSalarioFixo(temp.getSalarioFixo() * 1.1);
				System.out.println(temp);
			}
			System.out.printf("Salário: R$ %.2f", atual.salario());
			System.out.println();
			System.out.println();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("O empregado %d é %s\n", i, vetor[i].getClass().getName());
		}
	}
}
