
public class Motor {
	public boolean ligado;
	public int tempoMax;
	
	public Motor(int tempoMax) {
		ligado = false;
		this.tempoMax = tempoMax;
	}
	public void ligar() {
		System.out.println("Motor Ligado");
		ligado = true;
	}
	public void desligar() {
		System.out.println("Motor Desligado");
		ligado = false;
	}
	public static void main(String[] args) {
		//teste para funcionamento do motor
		
		Motor motor = new Motor(15);//tempo máximo em segundos
		new FuncionamentoMotor(motor).start();
	}
	public static class FuncionamentoMotor extends Thread{
		private Motor motor;
		private int tempo;
		public FuncionamentoMotor(Motor motor) {
			this.motor = motor;
		}
		@Override
		public void run() {
			motor.ligar();
			while (true) {
				tempo++;
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(motor.tempoMax == tempo){
					motor.desligar();
				}
				System.out.println("tempo: "+ tempo +" segundos");
			}
		}
	}
}
