
public abstract class Duck {
	private String name;
	private Voar voar;
	
	public Duck(String name, Voar voar) {
		this.name = name;
		this.voar = voar;
	}
	
	public void swim() {
		System.out.println("Michale Phelps do Brasilllll");
	}
	public void myFly() {
		voar.fly();
	}
	public void setVoar(Voar voar) {
		this.voar = voar;
	}
}
