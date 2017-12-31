package asw;

public class DescontoEspecial implements Desconto{
	private int descontoMaximo;
	public DescontoEspecial(int descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}
	@Override
	public double descontar(int percentual) {
		if (podeAplicarDesconto(percentual)) {
			return (double)percentual/100;
		}else {
			return (double)descontoMaximo/100;
		}
	}

	@Override
	public boolean podeAplicarDesconto(int percentual) {
		return (percentual < descontoMaximo);
	}
	
}
