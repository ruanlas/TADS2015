
public class ThreadString extends Thread{
	private StringBuilder sb;
	
	public ThreadString(StringBuilder sb) {
		this.sb = sb;
	}
	@Override
	public void run() {
		for (int i = 0; i < 2000000; i++) {
			sb.append(i).append(' ');
		}
	}
	public static void main(String[] args) {
		StringBuilder sb  = new StringBuilder();
		new ThreadString(sb).start();
		new ThreadString(sb).start();
		new ThreadString(sb).start();
		System.out.println(sb);
	}

}
