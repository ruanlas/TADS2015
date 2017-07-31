
public class PizzariaMineira extends Pizzaria{

	@Override
	public void definirPizza() {
		System.out.println("Definir a pizzs no estilo Mineiro!");
	}

	@Override
	public Pizza fabricarPizza(String sabor) {
		return FabricaPizza.fabricarPizza(sabor);
	}
	
}
