package asw;

public class Desconto15 implements Desconto{

	@Override
	public double descontar(int percentual) {
		if (podeAplicarDesconto(percentual)) {
			return (double)percentual/100;
		}else {
			return 0.15;
		}
	}

	@Override
	public boolean podeAplicarDesconto(int percentual) {
		return (percentual <= 15);
	}

}
