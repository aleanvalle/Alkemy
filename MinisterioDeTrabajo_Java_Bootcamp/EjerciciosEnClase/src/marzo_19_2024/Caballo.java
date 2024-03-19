package marzo_19_2024;

public class Caballo extends Animal {

	public Caballo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caballo(String nombre, String alimento, int edad, String raza) {
		super(nombre, alimento, edad, raza);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void comer() {
		edad += 3;
	}

	@Override
	protected void dormir() {
		edad -= 1.5;
	}

	@Override
	protected String emitirSonido() {
		// TODO Auto-generated method stub
		return "fffns";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
