package Herança;

class Cubo extends Quadrado {
	
	
	Cubo(double x,double y,double lado){
		super(x, y, lado);
	}

	public double areaLado() { 
		return 6 * lado * lado;
	}

	public double volume() {
		return lado * lado * lado;
	}
}
