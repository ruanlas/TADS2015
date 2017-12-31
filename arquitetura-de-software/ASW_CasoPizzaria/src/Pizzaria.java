
public abstract class Pizzaria {
	
	public Pizza criarPizza(String sabor) {
		Pizza pizza = fabricarPizza(sabor);
		
		definirPizza();
	
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
	
		return pizza;
	}
	
	public abstract void definirPizza();
	public abstract Pizza fabricarPizza(String sabor);
}
