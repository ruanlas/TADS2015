
public class Circulo extends Figura{

	private int raio;
	
	public Circulo(int raio, String cor, int x, int y){
		super(cor, x, y);
		this.raio = raio;
	}
	
	public void descreverCirculo(){
		System.out.println("Desenho:circulo, raio:"+raio+", cor:"+this.getCor()+
				", posicao:("+this.getX()+","+this.getY()+");");
	}
}