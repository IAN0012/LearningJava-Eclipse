package readaptation;

import java.util.Locale;
import java.util.Scanner;
import entities.Atributos;

public class Whith_poo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		   	
		Atributos x = new Atributos();
		Atributos y = new Atributos();
		
		
		System.out.println("Digite os TR�S lados do tri�ngulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os TR�S lados do trin�gulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("Area do trin�ngulo X: "+ x.area());
		System.out.println("Area do trin�ngulo Y: "+ y.area());
		System.out.println("");
		
		if(y.area() < x.area()){
			System.out.println("X � maior que Y");
		} else {
			System.out.println("Y � maior que X");
		}
		sc.close();
	}

}
