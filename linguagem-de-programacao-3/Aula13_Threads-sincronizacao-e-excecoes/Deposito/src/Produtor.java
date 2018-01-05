
public class Produtor extends Thread{
	private Deposito dep;
	private int tempo;
	
	public Produtor(Deposito dep, int i) {
		this.dep = dep;
		this.tempo = i*1000;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			while (dep.colocar()==0) {
				try {
					synchronized (dep) {
						dep.wait(tempo);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
