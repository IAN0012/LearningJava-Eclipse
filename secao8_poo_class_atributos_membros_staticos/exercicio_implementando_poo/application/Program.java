package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		/*
		- Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y 
		(suponha medidas v�lidas). 
		- Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual
		dos dois tri�ngulos possui a maior �rea.
		- A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de 
		seus lados a, b e c � a seguinte (f�rmula de Heron):
		*/
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		// Triangle X
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		Double areaX = x.area();
		
		
		// Triangle Y 
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		Double areaY = y.area();
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		System.out.printf("Triangle X area: %.5f%n", areaX);
		System.out.printf("Triangle Y area: %.5f%n", areaY);
		
		sc.close();
	}

}
