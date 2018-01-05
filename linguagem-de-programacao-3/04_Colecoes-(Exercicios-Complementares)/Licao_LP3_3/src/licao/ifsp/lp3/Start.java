package licao.ifsp.lp3;

import java.util.ArrayList;
import java.util.HashSet;

public class Start {
	
	public static void main(String[] args) {
		ArrayList<Integer> listaInt = new ArrayList<Integer>();
		listaInt.add(1);
		listaInt.add(3);
		listaInt.add(6);
		listaInt.add(1);
		listaInt.add(3);
		listaInt.add(7);
		listaInt.add(10);
		listaInt.add(14);
		listaInt.add(32);
		listaInt.add(21);
		listaInt.add(13);
		listaInt.add(10);
		listaInt.add(31);
		for (Integer integer : listaInt) {
			System.out.println(integer);
		}
		System.out.println();
		//ControleColecaoInt.filtroNumerosDuplicados(new HashSet<Integer>(listaInt));
		for (Integer integer : ControleColecaoInt.filtroNumerosDuplicados(new HashSet<Integer>(listaInt))) {
			System.out.println(integer);
		}
	}
}
