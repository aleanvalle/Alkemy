package marzo_19_2024;

public class Perro extends Animal {

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void comer() {
		edad += 0.05;
	}

	@Override
	protected void dormir() {
		edad -= 1;
	}

	@Override
	protected String emitirSonido() {
		return "Guau";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
