package ifsp.lp3;

public class FormaGeometrica {
	private String nomeDaForma;
	private double areaDaForma;
	public FormaGeometrica() {
		// TODO Auto-generated constructor stub
		this.areaDaForma = 0;
		this.nomeDaForma = "Segmento de Reta";
	}
	public double calculaArea() {
		return this.areaDaForma;
	}
	public String getNomeDaForma() {
		return nomeDaForma;
	}
	public void setNomeDaForma(String nomeDaForma) {
		this.nomeDaForma = nomeDaForma;
	}
	public double getAreaDaForma() {
		return areaDaForma;
	}
	public void setAreaDaForma(double areaDaForma) {
		this.areaDaForma = areaDaForma;
	}
}
