
public class ConjuntoDeInteiros {
	private boolean conjunto[] = new boolean[101];
	
	public ConjuntoDeInteiros() {
		for (int i = 0; i < conjunto.length; i++) {
			conjunto[i] = false;
		}
	}
	
	public void insereElemento(int k) {
		conjunto[k] = true;
	}
	
	public void deletaElemento(int m) {
		conjunto[m] = false;
	}
	
	public static ConjuntoDeInteiros uniao(ConjuntoDeInteiros conjunto1, ConjuntoDeInteiros conjunto2) {
		ConjuntoDeInteiros uniao = new ConjuntoDeInteiros();
		for (int i = 0; i < 101; i++) {
			if (conjunto1.conjunto[i]==true || conjunto2.conjunto[i]==true) {
				uniao.insereElemento(i);
			}
		}
		
		return uniao;
	}
	
	public static ConjuntoDeInteiros intersecao(ConjuntoDeInteiros conjunto1, ConjuntoDeInteiros conjunto2) {
		ConjuntoDeInteiros intersecao = new ConjuntoDeInteiros();
		for (int i = 0; i < 101; i++) {
			if (conjunto1.conjunto[i]==true && conjunto2.conjunto[i]==true) {
				intersecao.insereElemento(i);
			}
		}
		
		return intersecao;
	}
	
	public String toSetString() {
		String resultado = "";
		for (int i = 0; i < conjunto.length; i++) {
			if(conjunto[i]){
				resultado += (i + " ");
			}
		}
		if (resultado == "") {
			resultado = "-";
		}
		return resultado;
	}
	
	public static boolean eIgualA(ConjuntoDeInteiros conjunto1, ConjuntoDeInteiros conjunto2) {
		boolean igual = true;
		for (int i = 0; i < 101; i++) {
			if (conjunto1.conjunto[i]==true && conjunto2.conjunto[i]==false || conjunto1.conjunto[i]==false && conjunto2.conjunto[i]==true) {
				igual = false;
			}
		}
		
		return igual;
	}
	
	
	public static void main(String[] args) {
		//teste dos métodos
		ConjuntoDeInteiros conjunto1 = new ConjuntoDeInteiros();
		ConjuntoDeInteiros conjunto2 = new ConjuntoDeInteiros();
		System.out.println(conjunto1.toSetString());
		conjunto1.insereElemento(1);
		conjunto1.insereElemento(22);
		conjunto1.insereElemento(55);
		conjunto1.insereElemento(21);
		conjunto1.insereElemento(64);
		conjunto1.insereElemento(32);
		conjunto1.insereElemento(12);
		conjunto2.insereElemento(1);
		conjunto2.insereElemento(12);
		conjunto2.insereElemento(32);
		conjunto2.insereElemento(90);
		conjunto2.insereElemento(20);
		conjunto2.insereElemento(43);
		conjunto2.insereElemento(77);
		
		System.out.println("Conjunto 1 = "+ conjunto1.toSetString());
		conjunto1.deletaElemento(22);
		System.out.println("Conjunto 1 = "+ conjunto1.toSetString()+" Elemento 22 Deletado");
		System.out.println("Conjunto 2 = "+ conjunto2.toSetString());
		System.out.println("União = Conjunto 1 + Conjunto 2: " + ConjuntoDeInteiros.uniao(conjunto1, conjunto2).toSetString());
		System.out.println("Intersecao = Conjunto 1 + Conjunto 2 :" + ConjuntoDeInteiros.intersecao(conjunto1, conjunto2).toSetString());

	}
	
}
