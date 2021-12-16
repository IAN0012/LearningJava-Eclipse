package readaptation;

import java.util.Locale;
import java.util.Scanner;

public class sem_poo {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y	
	(suponha medidas v�lidas). Em seguida, mostrar o valor das �reas dos dois
	tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea.	
	*/

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite os TR�S lados do tri�ngulo X");
		double l1 = sc.nextDouble();
		double l2 = sc.nextDouble();
		double l3 = sc.nextDouble();
		double p = (l1+l2+l3)/2;
		double area = p*(p-l1)*(p-l2)*(p-l3); 
		double areaX = Math.sqrt(area);
		
		System.out.println("Digite os TR�S lados do trin�gulo Y");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		l3 = sc.nextDouble();
		p = (l1+l2+l3)/2;
		double areaY = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
		
		System.out.println("Area do trin�ngulo X: "+ areaX);
		System.out.println("Area do trin�ngulo Y: "+ areaY);
		System.out.println("");
		
		if(areaY < areaX){
			System.out.println("X � maior que Y");
		} else {
			System.out.println("Y � maior que X");
		}
		sc.close();
	}


}
