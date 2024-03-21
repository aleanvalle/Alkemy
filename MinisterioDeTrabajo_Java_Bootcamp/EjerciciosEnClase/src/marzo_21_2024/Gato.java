package marzo_21_2024;

public class Gato extends Animal {

	public Gato() {}

	public Gato(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
	}

	@Override
	public String hacerRuido() {
		return "Miau";
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
