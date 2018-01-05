
public class ThreadsEstranhas {
	static String mensagem;
	
	private static class ThreadCoxinha extends Thread{
		@Override
		public void run() {
			while (true) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					
				}
				
				mensagem = "N�o � golpe";
			}
		}
	}
	
	private static class ThreadPetralha extends Thread{
		@Override
		public void run() {
			while (true) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					
				}
				
				mensagem = "� golpe";
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		(new ThreadCoxinha()).start();
		(new ThreadPetralha()).start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(mensagem);
			Thread.sleep(200);
		}
	}
	
}
