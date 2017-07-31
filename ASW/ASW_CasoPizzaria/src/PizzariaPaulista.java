
public class PizzariaPaulista extends Pizzaria{

	@Override
	public void definirPizza() {
		System.out.println("Definir a pizza no estilo Paulista!");
		
	}

	@Override
	public Pizza fabricarPizza(String sabor) {
		return FabricaPizza.fabricarPizza(sabor);
	}
	
}
