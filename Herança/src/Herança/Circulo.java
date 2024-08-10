package Herança;

class Circulo extends Ponto {
		
	protected double raio;
	
	 Circulo(double x,double y,double raio) {
		super(x, y);
		this.raio=raio;
	}
	
	
	void setRaio(double raio) {
		this.raio=raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double area() {
		double area=(Math.PI*raio*raio);
		return area;
	}
	
		
}
