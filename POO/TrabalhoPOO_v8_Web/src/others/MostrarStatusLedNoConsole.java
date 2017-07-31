package others;

import interfaces.AcaoSerialEventListener;

public class MostrarStatusLedNoConsole implements AcaoSerialEventListener{

	@Override
	public void acaoSerialListener(String dadoLido) {
		System.out.println(dadoLido);
	}

}
