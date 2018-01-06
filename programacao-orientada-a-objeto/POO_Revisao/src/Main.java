
public class Main {
	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.adicionarRetangulo(2, 5, "CINZA", 1, 5);
		tela.adicionarCirculo(3, "AZUL", 4, 3);
		tela.adicionarRetangulo(4, 3, "VERDE", 7, 6);
		tela.exibir();
	}	
}