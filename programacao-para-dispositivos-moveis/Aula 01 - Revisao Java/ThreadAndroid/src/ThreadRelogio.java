import java.util.Calendar;

public class ThreadRelogio extends Thread{
	public ThreadRelogio(String nome) {
		super(nome);
	}
	
	@Override
	public void run() {
		Calendar calendario = Calendar.getInstance();
		while (true) {
			try {
				calendario = Calendar.getInstance();
				System.out.println("("+this.getName()+") "+calendario.getTime());
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
