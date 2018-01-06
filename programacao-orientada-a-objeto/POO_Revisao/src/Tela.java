import java.util.ArrayList;
import java.util.List;

public class Tela {
	private int indiceFigura;
	private List<Integer> indiceFiguras;
	private List<String> tipoFiguras;
	private List<Figura> figuras;
	
	public Tela(){
		indiceFigura = -1;
		indiceFiguras = new ArrayList<>();
		tipoFiguras = new ArrayList<>();
		figuras = new ArrayList<>();
	}
	
	public void adicionarCirculo(int raio, String cor, int x, int y){
		figuras.add(++indiceFigura, new Circulo(raio, cor, x, y));
		tipoFiguras.add("CIRCULO");
		indiceFiguras.add(indiceFigura);
	}
	
	public void adicionarRetangulo(int comprimento,int altura,String cor,int x,int y){
		figuras.add(++indiceFigura, new Retangulo(altura,comprimento,cor, x, y));
		tipoFiguras.add("RETANGULO");
		indiceFiguras.add(indiceFigura);
	}
	
	public void exibir(){
		int indice;
		String tipo;
		int totalFiguras = figuras.size();
		for (int i =0; i < totalFiguras; i++) {
			tipo = tipoFiguras.get(i);
			indice = indiceFiguras.get(i);
			switch (tipo) {
			case "RETANGULO":
				((Retangulo) figuras.get(indice)).descreverRetangulo();
				break;
			case "CIRCULO":
				((Circulo) figuras.get(indice)).descreverCirculo();
				break;
			}
		}
	}
}