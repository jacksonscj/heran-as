package Herança;

class Paralelepipedo extends Ponto {

	protected double comprimento;
	protected Quadrado baseQuadrado;

	 Paralelepipedo(double x, double y, double lado, double comprimento) {
		super(x, y);
		this.baseQuadrado = new Quadrado(x,y,lado);
		this.comprimento = comprimento;

	}

	public double areaParalelepipedo() {
		double areaParalelepipedo = baseQuadrado.areaQuadrado() * comprimento;
		return areaParalelepipedo;
	}

}
