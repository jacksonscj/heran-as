package Herança;

class Ponto {
	protected double x;
	protected double y;

	Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setPonto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
