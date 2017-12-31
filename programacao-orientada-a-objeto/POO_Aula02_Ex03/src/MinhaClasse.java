
public class MinhaClasse {
		int valor1;
		int valor2;
		
		MinhaClasse(int v1, int v2) {
			valor1 = v1;
			valor2 = v2;
		}
		
		void incrementarValor1() {
			++valor1;
		}
			
		void imprimirCampos() {
			System.out.println(valor1 + "," + valor2);
		}

}
