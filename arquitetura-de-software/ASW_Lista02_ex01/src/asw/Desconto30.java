package asw;

public class Desconto30 implements Desconto{

	@Override
	public double descontar(int percentual) {
		if(podeAplicarDesconto(percentual)){
			return (double)percentual/100;
		}else {
			return 0.3;
		}
	}

	@Override
	public boolean podeAplicarDesconto(int percentual) {
		return (percentual <= 30);
	}

}
