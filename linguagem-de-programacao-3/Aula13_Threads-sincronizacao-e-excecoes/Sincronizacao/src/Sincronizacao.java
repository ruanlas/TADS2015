
public class Sincronizacao {
	
	public synchronized void Metodo1() {
		System.out.println("Dentro da Regi�o Cr�tica");
	}
	public void metodo2() {
		System.out.println("Fora da Regi�o Cr�tica");
		
		synchronized(this){
			System.out.println("Dentro da Regi�o Cr�tica");
		}
	}
	public static void main(String[] args) {
		Sincronizacao sn = new Sincronizacao();
		//sn.Metodo1();
		sn.metodo2();
	}
}
