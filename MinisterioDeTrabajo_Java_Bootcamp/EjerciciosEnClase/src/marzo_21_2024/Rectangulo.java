package marzo_21_2024;

public class Rectangulo implements CalculosFormas {
	int base;
	int altura;
	
	public Rectangulo() {}
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return base * altura;
	}
	
	@Override
	public double perimetro() {
		return (base + altura) / 2;
	}
	
	
}
