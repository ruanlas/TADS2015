import java.util.ArrayList;

public class Teste1 {
	public static void main(String[] args) {
		ArrayList<User> meusUsuarios = new ArrayList<>();
		User u1 = new User("Paulo", 12);
		meusUsuarios.add(u1);
		User u2 = new User("João", 15);
		meusUsuarios.add(u2);
		User u3 = new User("Danilo", 10);
		meusUsuarios.add(u3);
		User u4 = new User("José", 19);
		meusUsuarios.add(u4);
		
		for (User user : meusUsuarios) {
			System.out.println(user);
		}
		
	}
}
