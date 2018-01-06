
public class Retangulo extends Figura{

	private int altura;
	private int comprimento;
	
	public Retangulo(int altura, int comprimento, String cor, int x, int y){
		super(cor, x, y);
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public void descreverRetangulo(){
		System.out.println("Desenho:retangulo, comprimento:"+comprimento+",altura:"+altura+", cor:"+
				this.getCor()+", posicao:("+this.getX()+","+this.getY()+");");
	}
}