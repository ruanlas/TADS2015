
public class FabricaPizza {
	//Metodo para criar a pizza apropriada
	public static Pizza fabricarPizza(String sabor) {
		switch (sabor.toUpperCase()) {
		case "QUEIJO":
			return new PizzaQueijo();
		case "CALABRESA":
			return new PizzaCalabreza();
		case "PORTUGUESA":
			return new PizzaPortuguesa();
		case "LOMBO":
			return new PizzaLombo();
		default:
			return null;
		}
	}
}
