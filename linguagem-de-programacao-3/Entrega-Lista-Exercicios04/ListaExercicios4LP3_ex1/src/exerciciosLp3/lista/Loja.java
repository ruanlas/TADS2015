package exerciciosLp3.lista;

import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		Livros livro1 = new Livros("Bela Adormecida", 34.34, "23413242", "Carlos Monteiro");
		Cds cd1 = new Cds("Zeca Pagodinho", 21.32, "43566444", 8);
		Livros livro2 = new Livros("Contos de Ninar", 14.90, "7753577", "Rubens Mattos");
		Dvds dvd1 = new Dvds("Piratas do Caribe", 32.94, "52347642", 90);
		Dvds dvd2 = new Dvds("Os Intocáveis", 14.89, "09032983", 120);
		Cds cd2 = new Cds("Zeca Baleiro", 11.32, "56200444", 12);
		Produto p1 = new Produto("Qualquer", 11.32, "0444");
		lista.add(dvd2);
		lista.add(dvd1);
		lista.add(livro2);
		lista.add(cd1);
		lista.add(livro1);
		
		Produto[] vetor = {dvd1, dvd2, cd1, livro1, livro2};
		
		buscaPorProduto(lista, cd1);
		System.out.println();
		buscaPorProduto(lista, livro1);
		System.out.println();
		buscaPorProduto(lista, cd2);
		System.out.println();
		buscaPorProduto(lista, p1);
		System.out.println();
		
		System.out.println();
		buscaPorProduto(vetor, cd1);
		System.out.println();
		buscaPorProduto(vetor, livro1);
		System.out.println();
		buscaPorProduto(vetor, cd2);
		System.out.println();
		buscaPorProduto(vetor, p1);
		System.out.println();
		
		//utilizando vetor
		for (Produto produto : vetor) {
			System.out.println(produto.toString());
			System.out.println();
		}
		//utilizando lista
		for (Produto produto : lista) {
			System.out.println(produto.toString());
			System.out.println();
		}
		
		Cds objCd1_a = new Cds();
		Cds objCd1_b = new Cds();
		objCd1_a = cd1;
		objCd1_b = cd1;
		objCd1_b.setCodBarras("924234");
		
		buscaPorProduto(vetor, objCd1_a);
		buscaPorProduto(vetor, objCd1_b);
		System.out.println(objCd1_a.getCodBarras());
		System.out.println(objCd1_b.getCodBarras());
		
		
		System.out.println();
	}
	
	public static void buscaPorProduto(ArrayList<Produto> lista, Produto p) {
		//Caso o indexOf() não encontre o objeto na lista, ele retorna o valor -1
		//lista.indexOf(o);
		if(lista.indexOf(p) == -1){
			System.out.println("O produto: \n" + p.toString() + "\nNão foi encontrado na lista");
		}else{
			System.out.println("O produto: \n" + p.toString() + "\nEstá localizado na posição [" + lista.indexOf(p) + "] da lista");
		}
//		System.out.println(lista.indexOf(p));
	}
	
	public static void buscaPorProduto(Produto[] vetor, Produto p) {
		int indice = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(p)) {
				indice = i;
			}
//			if(vetor[i]==p){
//				indice = i;
//			}
		}
		if(indice == -1){
			System.out.println("O produto: \n" + p.toString() + "\nNão foi encontrado na lista");
		}else{
			System.out.println("O produto: \n" + p.toString() + "\nEstá localizado na posição [" + indice + "] da lista");
		}
		
	}
}
