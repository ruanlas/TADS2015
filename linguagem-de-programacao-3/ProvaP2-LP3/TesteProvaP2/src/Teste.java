
public class Teste {
	private int x;
	
	public Teste() {
		x = 10;
	}
	public Teste(int c, int d){
		x = c+d;
	}
	
	public int getX() {
		return x;
	}
	
	public void m1(int a) {
		int p;
		try {
			p = x%a;
			if (p<4) {
				throw new Exc01();
			}
		}catch (Exc01 e) {
			x+=5;
			return;
		}catch (Exception e) {
			x+=7;
			return;
		}finally {
			x+=9;
		}
		return;
		
	}
	public class Exc01 extends Exception{
		
	}
	public static void main(String[] args) {
		Teste t = new Teste(1,2);
		t.m1(5);
		System.out.println(t.getX());
	}
	
//	public static class Q05{
//		public static void main(String[] args) {
//			Teste t = new Teste(1,2);
//			t.m1(5);
//			System.out.println(t.getX());
//		}
//	}
}
