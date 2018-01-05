
public class Sincronizacao {
	
	public synchronized void Metodo1() {
		System.out.println("Dentro da Região Crítica");
	}
	public void metodo2() {
		System.out.println("Fora da Região Crítica");
		
		synchronized(this){
			System.out.println("Dentro da Região Crítica");
		}
	}
	public static void main(String[] args) {
		Sincronizacao sn = new Sincronizacao();
		//sn.Metodo1();
		sn.metodo2();
	}
}
