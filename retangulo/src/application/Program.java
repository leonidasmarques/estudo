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
		
		System.out.printf("Area = %.2f%n" , retangulo.areaRetangulo());
		System.out.printf("Perimetro = %.2f%n" , retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n" , retangulo.diagonal());
		
		sc.close();

	}

}
