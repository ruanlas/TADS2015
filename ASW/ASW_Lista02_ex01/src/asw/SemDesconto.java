package asw;

public class SemDesconto implements Desconto{

	@Override
	public double descontar(int percentual) {
		return 0;
	}

	@Override
	public boolean podeAplicarDesconto(int percentual) {

		return (percentual == 0);
	}
}
