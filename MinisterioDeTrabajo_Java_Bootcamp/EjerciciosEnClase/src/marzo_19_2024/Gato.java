package marzo_19_2024;

public class Gato extends Animal {

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void comer() {
		edad += 2;
	}

	@Override
	protected void dormir() {
		edad -= 8;
	}

	@Override
	protected String emitirSonido() {
		// TODO Auto-generated method stub
		return "Miau";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
