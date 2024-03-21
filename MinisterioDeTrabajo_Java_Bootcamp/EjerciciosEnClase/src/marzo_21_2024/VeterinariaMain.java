package marzo_21_2024;

import java.util.ArrayList;

public class VeterinariaMain {

	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<Animal>();
		Animal a = new Animal();
		Animal b = new Perro();
		Animal c = new Gato();
		
		animales.add(a);
		animales.add(b);
		animales.add(c);
		
		for(Animal animal: animales) {
			System.out.println(animal.hacerRuido());
		}
	}

}
