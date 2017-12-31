
public abstract class Pizza {
	protected String massa;
	protected String queijo;
	protected String molho;
	
	//metodos
//	public Pizza criarPizza(String sabor) {
//		Pizza pizza = FabricaPizza.fabricarPizza(sabor);
//		
//		pizza.preparar();
//		pizza.assar();
//		pizza.cortar();
//		pizza.embalar();
//		
//		return pizza;
//	}
	
	//método para preparar pizza
	public void preparar() {
		System.out.println("Preparando minha pizza");
	}
	
	//método para assar pizza
	public void assar() {
		System.out.println("Assando a pizza por 10 minutos a 180º");
	}
	
	//método para cortar a pizza
	public void cortar() {
		System.out.println("Cortar a pizza em 8 fatias");
	}
	
	//método para embalar a pizza
	public void embalar() {
		System.out.println("Embalar a pizza na caixa padrão");
	}
}
