import java.util.ArrayList;
import java.util.Random;


public class Start {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Avenida Dos Manac�s, 356 - Centro");
		//lista com 20 nomes comuns
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("Renato");
		nomes.add("Luiz");
		nomes.add("Fernando");
		nomes.add("Marcia");
		nomes.add("Carlos");
		nomes.add("Rodrigo");
		nomes.add("M�rcio");
		nomes.add("Ricardo");
		nomes.add("Maria");
		nomes.add("Leonardo");
		nomes.add("Robson");
		nomes.add("Afonso");
		nomes.add("Aline");
		nomes.add("Breno");
		nomes.add("Let�cia");
		nomes.add("Camila");
		nomes.add("Bruno");
		nomes.add("Felipe");
		nomes.add("Rodolfo");
		
		//lista com 20 sobrenomes comuns
		ArrayList<String> sobreNomes = new ArrayList<String>();
		sobreNomes.add(" de Oliveira");
		sobreNomes.add(" Barbosa");
		sobreNomes.add(" da Silva");
		sobreNomes.add(" dos Santos");
		sobreNomes.add(" de Carvalho");
		sobreNomes.add(" de Souza");
		sobreNomes.add(" Bonfim");
		sobreNomes.add(" Alves");
		sobreNomes.add(" de Farias");
		sobreNomes.add(" Cancum");
		sobreNomes.add(" Magalh�es");
		sobreNomes.add(" Dorta");
		sobreNomes.add(" Ferreira");
		sobreNomes.add(" Bueno");
		sobreNomes.add(" Teixeira");
		sobreNomes.add(" Prado");
		sobreNomes.add(" Mello");
		sobreNomes.add(" Antunes");
		sobreNomes.add(" Marcon");
		sobreNomes.add(" Pereira");

		//lista com 40 palavras comuns para compor o nome do livro
		ArrayList<String> nomeLivros = new ArrayList<String>();
		nomeLivros.add("A Outra Gera��o");
		nomeLivros.add("A Outra Metade");
		nomeLivros.add("Arquitetura Mooderna");
		nomeLivros.add("A arte da medicina");
		nomeLivros.add("Mantenha Distancia");
		nomeLivros.add("A hora de parar");
		nomeLivros.add("Mudan�as de Efeito");
		nomeLivros.add("Como Empreender");
		nomeLivros.add("Tecnologia e Ciecia Contempor�nea");
		nomeLivros.add("O outro lado da F�sica");
		nomeLivros.add("Cria��o de jogos");
		nomeLivros.add("A matem�tica da vida");
		nomeLivros.add("Manual da Mulher");
		nomeLivros.add("Hora da Vit�ria");
		nomeLivros.add("Dias de Luta");
		nomeLivros.add("Ataques Cibern�ticos");
		nomeLivros.add("Manual de Ingles");
		nomeLivros.add("O dia em que a terra parou");
		nomeLivros.add("Seguran�a da informa��o");
		nomeLivros.add("Biologia Animal");
		nomeLivros.add("Medicina Veterin�ria");
		nomeLivros.add("Maquinas mort�feras");
		nomeLivros.add("A historia sem fim");
		nomeLivros.add("Hist�ria das m�sicas");
		nomeLivros.add("Biologia Vegetal");
		nomeLivros.add("Matem�tica Financeira");
		nomeLivros.add("Ingles Intermedi�rio");
		nomeLivros.add("ingles para empresas");
		nomeLivros.add("Alem�o - A hist�ria completa");
		nomeLivros.add("Outras faces da modernidade");
		nomeLivros.add("Estudo da sociologia");
		nomeLivros.add("Estudo do tempo");
		nomeLivros.add("Geografia contempor�nea");
		nomeLivros.add("Literatura moderna");
		nomeLivros.add("O dia do descobrimento");
		nomeLivros.add("Ingles para iniciantes");
		nomeLivros.add("Inform�tica Aplicada");
		nomeLivros.add("Jogos Antigos");
		nomeLivros.add("A segunda guerra mundial");
		nomeLivros.add("A tecnologia do futuro");
		
		new CriaAutor(nomes, sobreNomes, biblioteca).start();
		new Thread2(biblioteca, nomeLivros).start();
		
		//System.out.println(biblioteca.getAutores().size());

	}
	
	public static class CriaAutor extends Thread{
		private Random gerador = new Random();
		private ArrayList<String> nomes;
		private ArrayList<String> sobreNomes;
		private Biblioteca biblioteca;
		
		public CriaAutor(ArrayList<String> nomes, ArrayList<String> sobrenomes, Biblioteca biblioteca) {
			this.nomes = nomes;
			this.sobreNomes = sobrenomes;
			this.biblioteca = biblioteca;
		}
		@Override
		public void run() {
			
			while (true) {
				Autor autor = new Autor(nomes.get(gerador.nextInt(19))+sobreNomes.get(gerador.nextInt(19)), null);

				if (biblioteca.addAutor(autor)) {
					try {
						synchronized (biblioteca) {
							biblioteca.wait(1000);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}
	}
	
	public static class Thread2 extends Thread{
		private Random gerador = new Random();
		private Biblioteca biblioteca;
		private ArrayList<String> nomeLivros;
		
		public Thread2(Biblioteca biblioteca, ArrayList<String> nomeLivros) {
			this.nomeLivros = nomeLivros;
			this.biblioteca = biblioteca;
		}
		@Override
		public void run() {
			while (true) {
				Publicacao publicacao = new Publicacao() {
				};
				int totalAltores = biblioteca.getAutores().size();
				Autor autor = biblioteca.getAutores().get(gerador.nextInt(totalAltores));
				publicacao.addAutores(autor);
				publicacao.setTitulo(nomeLivros.get(gerador.nextInt(39)));
					
				if (biblioteca.addPublicacao(publicacao)) {
					try {
						synchronized (biblioteca) {
							biblioteca.wait(1000);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
			}
			
		}
	}
}
