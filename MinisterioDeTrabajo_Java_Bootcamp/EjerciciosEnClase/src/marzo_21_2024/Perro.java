package marzo_21_2024;

public class Perro extends Animal {

	public Perro() {}

	public Perro(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
	}

	@Override
	public String hacerRuido() {
		return "Guau";
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
