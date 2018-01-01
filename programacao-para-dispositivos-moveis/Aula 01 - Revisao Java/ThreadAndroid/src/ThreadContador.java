
public class ThreadContador extends Thread{
	private int i;
	
	public ThreadContador(String nome, int inicioContador) {
		super(nome);
		i = inicioContador;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("("+ this.getName()+") Contador: "+i++);
				this.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
