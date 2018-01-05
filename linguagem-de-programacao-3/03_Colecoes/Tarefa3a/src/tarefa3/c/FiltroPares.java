package tarefa3.c;

import java.util.ArrayList;

public class FiltroPares {
	ArrayList<Integer> lista = new ArrayList<Integer>();
	public void adicionar(int nuumero) {
		lista.add(nuumero);
	}
	public ArrayList<Integer> obterListaPares() {
		ArrayList<Integer> listaPares = new ArrayList<Integer>();
		for (int numero : lista) {
			if(numero%2==0){
				listaPares.add(numero);
			}
		}
		return listaPares;
	}
}
