package Herança;

class Quadrado extends Ponto {
	protected double lado;
	
	Quadrado(double x,double y,double lado){
		super(x, y);
		this.lado=lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double areaQuadrado() { 
		return lado * lado;
	}

	public double perimetro() {
		return 4 * lado;
	}
}
