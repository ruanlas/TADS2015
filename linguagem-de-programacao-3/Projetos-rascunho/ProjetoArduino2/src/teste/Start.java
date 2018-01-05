package teste;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ControlePorta cp = new ControlePorta("COM3", 9600);
			cp.enviaDados(1);
			System.out.println("Liga");
			
		
		
	}
}
