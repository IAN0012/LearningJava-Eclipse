import java.util.Locale;
import java.util.Scanner;

public class estrutura_while {

	public static void main(String[] args) {
		//   Fazer um programa que lê números
		// inteiros até que um zero seja lido. Ao
		// final mostra a soma dos números lidos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, sum = 0;
		char repeat;
		
		do{
			System.out.println("Write a number");
			number = sc.nextInt();
			sum += number;
			System.out.println("Do you wish to continue?");
			repeat =  sc.next().charAt(0);
		}while(repeat == 's');
		
		System.out.println("The sum of values is: "+ sum);
		sc.close();
		
	}

}
