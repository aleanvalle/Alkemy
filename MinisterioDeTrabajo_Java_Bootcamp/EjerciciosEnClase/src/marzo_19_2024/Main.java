package marzo_19_2024;

public class Main {

	public static void main(String[] args) {
		Caballo caballo = new Caballo("pepe", "alfalfa", 5, "blanco");
		Perro perro = new Perro("pancho", "roast beef", 3, "golden retriever");
		Gato gato = new Gato("mate", "sardinas", 12, "pelo corto");
		caballo.comer();
		caballo.dormir();
		System.out.println(caballo.emitirSonido());
		perro.comer();
		perro.dormir();
		System.out.println(perro.emitirSonido());
		gato.comer();
		gato.dormir();
		System.out.println(gato.emitirSonido());
		System.out.println(caballo.toString());
		System.out.println(perro.toString());
		System.out.println(gato.toString());
	}

}
