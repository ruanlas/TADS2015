import java.util.ArrayList;

public class Pedido {
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<Produto> produtos;
	
	public Pedido() {
	}
	
	public Pedido(Cliente cliente, Vendedor vendedor) {
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public void addProdutos(Produto produto) {
		this.produtos.add(produto);
	}
	
	
}
