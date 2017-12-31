import java.util.HashMap;

public class Teste {
	public static void main(String[] args) {
		HashMap<Integer, Character> mapa = new HashMap<>();
		mapa.put(1, 'b');
		mapa.put(2, 'o');
		mapa.put(1, 'v');
		mapa.put(4, 'v');
		HashMap<Integer, HashMap<Integer, Character>> matriz = new HashMap<>();
		matriz.put(1, mapa);
		mapa.put(4, 'n');
		System.out.println(matriz);
	}
}
