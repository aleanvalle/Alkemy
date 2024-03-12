package marzo_12_2024;

public class Cafetera {
	int capacidadMaxima;
	int cantidadActual;
	
	public Cafetera() {}
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}
	
	public void servirTaza(int tamanio) {
		int tamanioInicial = tamanio;
		if(tamanio > cantidadActual) {
			tamanio = cantidadActual;
			vaciarCafetera();
		}
		else {
			cantidadActual -= tamanio;
		}
		if(tamanioInicial == tamanio) {
			System.out.println("Se lleno la taza.");
		}
		else {
			System.out.println("La taza tiene: " + tamanio + "ml de cafe.");
		}
	}
	
	public void vaciarCafetera() {
		cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		cantidadActual += cantidad;
	}
	
}
