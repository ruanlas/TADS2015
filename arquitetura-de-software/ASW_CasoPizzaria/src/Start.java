import javax.swing.JOptionPane;

public class Start {
	public static void main(String[] args) {
		Pizza pizza;
		
//		String sabor = JOptionPane.showInputDialog("Sabor? ");
		
//		switch (sabor) {
//		case "QUEIJO":
//			pizza = new PizzaQueijo();
//			break;
//		case "CALABRESA":
//			pizza = new PizzaCalabreza();
//			break;
//		case "PORTUGUESA":
//			pizza = new PizzaPortuguesa();
//			break;
//
//		default:
//			pizza = null;
//			break;
//		}
		
//		pizza = FabricaPizza.fabricarPizza(sabor);
		
		Pizzaria piz1 = new PizzariaPaulista();
		
		Pizzaria piz2 = new PizzariaMineira();
	}
}
