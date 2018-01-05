package ifsp.exercicios.lp3;

import java.util.ArrayList;

public class TesteAnimais {
	public static void main(String[] args) {
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		Animal animal1 = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0, 4);
		Peixe animal2 = new Peixe("Tubarão", "Cinzento", "Mar", 300, 1.5, "Barbatanas e cauda");
		Mamifero animal3 = new Mamifero("Urso-do-canadá", "Vermelho", "Terra", 180, 0.5, 4, "Mel");
		
		listaAnimal.add(animal1);
		listaAnimal.add(animal2);
		listaAnimal.add(animal3);
		
		for (Animal animal : listaAnimal) {
			animal.dados();
		}
	}
}
