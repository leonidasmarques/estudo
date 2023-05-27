package application;


import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Informe a largura: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Informe a altura: ");
		retangulo.altura = sc.nextDouble();
		double area = retangulo.areaRetangulo();
		System.out.println(area);
		
		double p = retangulo.perimetro();
		System.out.println(p);
		
		double d = retangulo.diagonal();
		System.out.println(d);
		
		sc.close();

	}

}
