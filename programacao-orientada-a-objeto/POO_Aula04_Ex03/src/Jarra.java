/* Respostas:
 * 
 * A) Sim, o programa funcionar� normalmente, pois a referencia 'this' faz referencia
 * ao campo do pr�prio objeto
 * 
 * B) N�o, o programa n�o funcionar� da mesma maneira pois o 'outra' faz referencia ao
 * campo de outro objeto
 * 
 * */
public class Jarra {
	int volumeAtual;

	Jarra(int volumeInicial) {
		volumeAtual = volumeInicial;
	}
	boolean podeDespejar(Jarra jarra){
		return !(this == jarra);
	}

	void despejarAguaEm(Jarra outra, int volumeADespejar) {
		if(this.podeDespejar(outra)){
			this.volumeAtual -= volumeADespejar;
			outra.volumeAtual += volumeADespejar;
		}else{
			System.out.println("N�o � poss�vel despejar o conte�do da jarra nela mesma");
		}
		
	}

	public static void main(String[] args) {
		Jarra a = new Jarra(100), b = new Jarra(200);

		System.out.printf("Jarra A comecou com %dmL e B com %dmL.\n",
				a.volumeAtual, b.volumeAtual);

		a.despejarAguaEm(b, 50);

		System.out.printf("Jarra A ficou com %dmL e B com %dmL.\n",
				a.volumeAtual, b.volumeAtual);

		b.despejarAguaEm(b, 10);

		System.out.printf("Jarra A ficou com %dmL e B com %dmL.\n",
				a.volumeAtual, b.volumeAtual);

	}
}
