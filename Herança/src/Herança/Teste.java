package Herança;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Entrada de dados para Ponto
		System.out.println("Digite as coordenadas do Ponto (x y):");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		Ponto ponto = new Ponto(x, y);
		System.out.println("valor de x: " + ponto.getX() + " valor de y: " + ponto.getY());

		// Entrada de dados para Circulo
		System.out.println("Digite o raio do Círculo:");
		double raio = scanner.nextDouble();
		Circulo circulo = new Circulo(x, y, raio);
		System.out.println("Área do Círculo: " + circulo.area());

		// Entrada de dados para Cilindro
		System.out.println("Digite a altura do Cilindro:");
		double altura = scanner.nextDouble();
		Cilindro cilindro = new Cilindro(x, y, raio, altura);
		System.out.println("Área do Cilindro: " + cilindro.areaCilindro());
		System.out.println("Volume do Cilindro: " + cilindro.volume());

		// Entrada de dados para Quadrado
		System.out.println("Digite o lado do Quadrado:");
		double lado = scanner.nextDouble();
		Quadrado quadrado = new Quadrado(x, y, lado);
		System.out.println("Área do Quadrado: " + quadrado.areaQuadrado());
		System.out.println("Perímetro do Quadrado: " + quadrado.perimetro());

		// Entrada de dados para Cubo
		Cubo cubo = new Cubo(x, y, lado);
		System.out.println("Área total do Cubo: " + cubo.areaLado());
		System.out.println("Volume do Cubo: " + cubo.volume());

		// Entrada de dados para Paralelepipedo
		System.out.println("Digite o comprimento do Paralelepípedo:");
		double comprimento = scanner.nextDouble();
		Paralelepipedo paralelepipedo = new Paralelepipedo(x, y, lado, comprimento);
		System.out.println("Área do Paralelepípedo: " + paralelepipedo.areaParalelepipedo());

		scanner.close();
	}
}
