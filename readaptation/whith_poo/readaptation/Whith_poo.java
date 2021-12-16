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
		
		
		System.out.println("Digite os TRÊS lados do triângulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os TRÊS lados do trinâgulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("Area do trinângulo X: "+ x.area());
		System.out.println("Area do trinângulo Y: "+ y.area());
		System.out.println("");
		
		if(y.area() < x.area()){
			System.out.println("X é maior que Y");
		} else {
			System.out.println("Y é maior que X");
		}
		sc.close();
	}

}
