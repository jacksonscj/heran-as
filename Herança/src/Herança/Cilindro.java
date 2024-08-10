package Herança;

class Cilindro extends Circulo {

	protected double altura;
	
	
	 Cilindro(double x,double y,double raio,double altura) {
		super(x, y, raio);
		this.altura=altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public double volume() {
		double volume = (Math.PI * Math.pow(raio, 2)*altura);
		return volume;
	}

	public double areaCilindro() {
		return 2 * Math.PI * raio * (raio + altura);
	}
}
