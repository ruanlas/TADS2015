import javax.swing.plaf.synth.SynthSpinnerUI;

public class Start {
	public static void main(String[] args) {
		MapaEsparso mE = new MapaEsparso();
		MapaCompleto mC = new MapaCompleto(32, 18);
		MapaMisto mM = new MapaMisto("Casa");
		
		System.out.println("Mapa Esparso");
		mE.definirElemento(1, 1, 'a');
		mE.definirElemento(1, 2, 'e');
		try {
			System.out.println(mE.obterElemento(1, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		mE.definirElemento(2, 2, 'p');
		mE.definirElemento(3, 1, 'w');
		mE.definirElemento(1, 2, 'r');
		try {
			System.out.println(mE.obterElemento(2, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		try {
			System.out.println(mE.obterElemento(1, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		try {
			System.out.println(mE.obterElemento(9, 9));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		//System.out.println(mE.obterElemento(9, 9));
		
		System.out.println("Mapa Completo");
		mC.definirElemento(1, 1, 'a');
		mC.definirElemento(1, 2, 'e');
		try {
			System.out.println(mC.obterElemento(1, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		mC.definirElemento(2, 2, 'p');
		mC.definirElemento(3, 1, 'w');
		mC.definirElemento(1, 2, 'r');
		try {
			System.out.println(mC.obterElemento(2, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		try {
			System.out.println(mC.obterElemento(1, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		try {
			System.out.println(mC.obterElemento(90, 90));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		//System.out.println(mC.obterElemento(90, 90));
		
		System.out.println("Mapa Misto");
		System.out.println("CASA");
		mM.definirElemento(1, 1, 'a');
		mM.definirElemento(1, 2, 'e');
		try {
			System.out.println(mM.obterElemento(1, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		mM.definirElemento(2, 2, 'p');
		mM.definirElemento(3, 1, 'w');
		mM.definirElemento(1, 2, 'r');
		try {
			System.out.println(mM.obterElemento(2, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		try {
			System.out.println(mM.obterElemento(1, 2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("A posição para o elemento está inválida");
		}
		
	}
}
