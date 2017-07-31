package aplicacao;

public class Avaliador {
	private double maiorLance = Double.NEGATIVE_INFINITY;
	private double menorLance = Double.POSITIVE_INFINITY;
	private double media;
	
	public void avaliar(Leilao leilao) {
		for (Lance l : leilao.getLances()) {
			if (maiorLance < l.getValor()) {
				maiorLance = l.getValor();
			}
			if (menorLance > l.getValor()) {
				menorLance = l.getValor();
			}
			media += l.getValor();
		}
		media = media/leilao.getLances().size();
	}

	public double getMaiorLance() {
		return maiorLance;
	}

	public double getMenorLance() {
		return menorLance;
	}

	public double getMedia() {
		return media;
	}
	
	
}
