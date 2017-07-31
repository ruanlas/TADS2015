import java.io.IOException;

public class Cronometro extends Thread{
	private int tempLimite;
	private int tempo;
	private boolean parar = false;
	private ComunicacaoSerial com;
	
	public Cronometro(int tempLimite, ComunicacaoSerial com) {
		this.tempLimite = tempLimite;
		this.com = com;
		this.tempo = 0;
	}
		@Override
		public void run() {
			boolean apagar = false;
			while (!apagar) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tempo++;
				if (tempo == tempLimite) {
					apagar = true;
				}
				System.out.println("tempo: "+ tempo +" segundos");
			}
			if (apagar) {
				try {
					com.enviaDados('2');
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}
