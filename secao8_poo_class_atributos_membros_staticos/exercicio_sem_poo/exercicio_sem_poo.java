import java.util.Locale;
import java.util.Scanner;

public class exercicio_sem_poo {

	public static void main(String[] args) {
		/*
		- Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
		(suponha medidas válidas). 
		- Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual
		dos dois triângulos possui a maior área.
		- A fórmula para calcular a área de um triângulo a partir das medidas de 
		seus lados a, b e c é a seguinte (fórmula de Heron):
		*/
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		Double x1, x2, x3, y1, y2, y3;
		
		// Triangle X
		
		System.out.println("Enter the measures of triangle X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		Double pX = (x1+x2+x3)/2;
		Double areaX = Math.sqrt(pX*(pX-x1)*(pX-x2)*(pX-x3));
		
		// Triangle Y 
		
		System.out.println("Enter the measures of triangle Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		Double pY = (y1+y2+y3)/2;
		Double areaY = Math.sqrt(pY*(pY-y1)*(pY-y2)*(pY-y3));
		
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
