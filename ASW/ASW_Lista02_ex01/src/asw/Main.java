package asw;

public class Main {
	public static void main(String[] args) {
		Artigo livro = new Livro(300, new Desconto30(), "Os sem terra");
		livro.aplicarDesconto(40);
		Artigo livroDigital = new Ebook(300, new Desconto15(), "Marley e eu");
		livroDigital.aplicarDesconto(40);
		Artigo revista = new Revista(89, new Desconto30(), "Veja Notícia");
		revista.aplicarDesconto(40);
		Artigo revistaDigital = new RevistaDigital(89, new Desconto15(), "Eletronica Total");
		revistaDigital.aplicarDesconto(40);
		Artigo jogoTabuleiro = new JogoTabuleiro(230, new Desconto30(), "Banco Imobiliário");
		jogoTabuleiro.aplicarDesconto(40);
		Artigo jogoVideoGame = new JogoVideoGame(230, new SemDesconto(), "Banco Imobiliário");
		jogoVideoGame.aplicarDesconto(40);
		
		livro.imprime();
		System.out.println();
		livroDigital.imprime();
		System.out.println();
		revista.imprime();
		System.out.println();
		revistaDigital.imprime();
		System.out.println();
		jogoTabuleiro.imprime();
		System.out.println();
		jogoVideoGame.imprime();
		System.out.println("\n\nDesconto especial de 60% nos Jogos de Vídeo Game\n");
		jogoVideoGame.mudarTipoDesconto(new DescontoEspecial(60));
		jogoVideoGame.aplicarDesconto(70);
		jogoVideoGame.imprime();
		
	}
}
