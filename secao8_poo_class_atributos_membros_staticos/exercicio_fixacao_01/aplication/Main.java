package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		/*
	 	Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. 
		 */
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the Rectangle WIDHT and HEIGHT");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f", rectangle.area());
		System.out.printf("%nPERIMETER = %.2f", rectangle.perimeter());
		System.out.printf("%nDIAGONAL = %.2f", rectangle.diagonal());
		sc.close();
	}

}
