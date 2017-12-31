
public class Start {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
		} catch (RuntimeException e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
