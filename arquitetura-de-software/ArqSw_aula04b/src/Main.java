
public class Main {
	public static void main(String[] args) {
		Duck patoReal = new PatoReal("Donald", new VoarNormal());
		
		System.out.println("Pato Real");
		patoReal.swim();
		patoReal.myFly();
		
		System.out.println();
		Duck marreco = new Marreco("Marreco", new VoarRazante());
		System.out.println("Marreco");
		marreco.swim();
		marreco.myFly();
		marreco.setVoar(new NaoVoar());
		marreco.myFly();
		
		System.out.println();
		Duck patoBorracha = new PatoBorracha("Patinho", new NaoVoar());
		System.out.println("Pato borracha");
		patoBorracha.swim();
		patoBorracha.myFly();
		
	}
}
