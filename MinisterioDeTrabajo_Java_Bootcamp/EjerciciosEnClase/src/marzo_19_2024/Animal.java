package marzo_19_2024;

public class Animal {
	protected String nombre;
	protected String alimento;
	protected int edad;
	protected String raza;

	public Animal() {
		
	}

	public Animal(String nombre, String alimento, int edad, String raza) {
		this.nombre = nombre;
		this.alimento = alimento;
		this.edad = edad;
		this.raza = raza;
	}

	protected void comer() {
		edad += 0.1;
	}
	
	protected void dormir() {
		edad -= 0.1;
	}
	
	protected String emitirSonido() {
		return "";
	}

	@Override
	public String toString() {
		return "{Nombre: " + nombre + 
				"\nAlimento: " + alimento +
				"\nEdad: " + edad +
				"\nRaza: " + raza + "}";
	}
}
