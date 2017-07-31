
public class OrdenaVetor {
	public static void main(String[] args) {
		int[] vetor = {2,10,1,9,6,4,3};
		int temp;
		int menor;
		System.out.println("Vetor antes da ordenação");
		System.out.print("| ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
		//Ordenação do vetor
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if ( !(vetor[i]<vetor[j]) ) {
					temp = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Vetor depois da ordenação");
		System.out.print("| ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
	}
}
