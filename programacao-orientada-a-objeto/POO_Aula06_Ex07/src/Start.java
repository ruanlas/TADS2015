import java.util.ArrayList;

public class Start {
	
	public static double somaAreaDosTerrenos(ArrayList<Terreno> lstTerr) {
		double soma = 0;
		for (Terreno terreno : lstTerr) {
			soma += terreno.calcularArea();
		}
		return soma;
	}
	public static void main(String[] args) {
		ArrayList<Terreno> lstTerr = new ArrayList<>();
		Terreno terrenoirregular1 = (Terreno) new TerrenoIrregular(200);
		lstTerr.add(terrenoirregular1);
		Terreno terrenoRetangular1 = (Terreno) new TerrenoRetangular(10, 20);
		lstTerr.add(terrenoRetangular1);
		Terreno terrenoirregular2 = (Terreno)new TerrenoIrregular(100);
		lstTerr.add(terrenoirregular2);
		Terreno terrenoRetangular2 = (Terreno) new TerrenoRetangular(20, 5);
		lstTerr.add(terrenoirregular2);
		
		System.out.println("Somatória total: " + somaAreaDosTerrenos(lstTerr));
		
	}
}
