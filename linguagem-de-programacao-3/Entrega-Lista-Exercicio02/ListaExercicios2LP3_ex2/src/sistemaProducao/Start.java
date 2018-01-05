package sistemaProducao;

public class Start {
	public static void main(String[] args) {
		MaquinaA maquinaA = new MaquinaA(7.9, 13.7, 45, 4.8, 10.9, 76);
		MaquinaB maquinaB = new MaquinaB(7.9, 13.7, 45, 3, 5.65, 37);
		maquinaA.produzirT(3, 5);
		System.out.println();
		System.out.println();
		maquinaB.produzirT(3, 5);
	}
}
