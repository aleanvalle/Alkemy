package marzo_21_2024;

public class Circulo implements CalculosFormas {
	int radio;
	
	public Circulo() {}
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	@Override
	public double area() {
		return pi * Math.pow(radio, 2);
	}
	
	@Override
	public double perimetro() {
		return pi * diametro;
	}
}
