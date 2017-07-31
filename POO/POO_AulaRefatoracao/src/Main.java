import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String numeroString = JOptionPane.showInputDialog("Digite um numero");
		int numeroInt = Integer.parseInt(numeroString);
		int sucessor = numeroInt + 1;
		System.out.println("Sucessor de " + numeroInt + ": " + sucessor);
		JOptionPane.showMessageDialog(null, "Sucessor de " + numeroInt + ": " + sucessor);
	}
}
