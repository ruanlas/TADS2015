
public class Consumidor implements Runnable{
	private Deposito dep;
	private int tempo;
	public Consumidor(Deposito dep, int i){
		this.dep = dep;
		this.tempo = i*1000;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			while (dep.retirar()==0) {
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
