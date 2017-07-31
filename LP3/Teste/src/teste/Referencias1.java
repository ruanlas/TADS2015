package teste;

class X {
}

public class Referencias1 {

	public static void main(String[] args) {
		X a = new X(), b = new X(), c = b, d = a;

		if (c == b) {
			System.out.println(1);
			if (a == b) System.out.println(2);
			a = b;
			if (d == a) System.out.println(3);
			if (d != b) System.out.println(4);
		}
	}

}