package tarefa3.d;

import java.util.ArrayList;
import java.util.Set;

public class ContadorPalavras {
	public int contarPalavrasConsiderandoRepeticoes(ArrayList<String> palavras) {
		return palavras.size();
	}
	public int contarPalavrasDesconsiderandoRepeticoes(Set<String> palavras) {
		return palavras.size();
	}
}
