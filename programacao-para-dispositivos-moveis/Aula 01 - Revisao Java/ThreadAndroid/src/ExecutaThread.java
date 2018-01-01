
public class ExecutaThread {
	public static void main(String[] args) {
		ThreadRelogio relogio = new ThreadRelogio("Thread do Relógio");
		relogio.start();
		
		ThreadContador contador = new ThreadContador("Thread do Contador", 1);
		contador.start();
	}
}
