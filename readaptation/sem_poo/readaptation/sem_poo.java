package readaptation;

import java.util.Locale;
import java.util.Scanner;

public class sem_poo {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler as medidas dos lados de dois triângulos X e Y	
	(suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
	triângulos e dizer qual dos dois triângulos possui a maior área.	
	*/

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite os TRÊS lados do triângulo X");
		double l1 = sc.nextDouble();
		double l2 = sc.nextDouble();
		double l3 = sc.nextDouble();
		double p = (l1+l2+l3)/2;
		double area = p*(p-l1)*(p-l2)*(p-l3); 
		double areaX = Math.sqrt(area);
		
		System.out.println("Digite os TRÊS lados do trinâgulo Y");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		l3 = sc.nextDouble();
		p = (l1+l2+l3)/2;
		double areaY = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
		
		System.out.println("Area do trinângulo X: "+ areaX);
		System.out.println("Area do trinângulo Y: "+ areaY);
		System.out.println("");
		
		if(areaY < areaX){
			System.out.println("X é maior que Y");
		} else {
			System.out.println("Y é maior que X");
		}
		sc.close();
	}


}
