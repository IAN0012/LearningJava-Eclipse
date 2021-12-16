import java.util.Locale;
import java.util.Scanner;

public class estrutura_for {

	public static void main(String[] args) {
		//   Fazer um programa que lê um valor
		// inteiro N e depois N números inteiros.
		// Ao final, mostra a soma dos N números
		// lidos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many numbers do you want to insert?");
		
		int quantity = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i != quantity; i++) {
			System.out.println("Write a number: ");
			int number = sc.nextInt();
			sum += number;
		}
		
		System.out.println("Sum total: "+ sum);
		sc.close();
	
	}
}
