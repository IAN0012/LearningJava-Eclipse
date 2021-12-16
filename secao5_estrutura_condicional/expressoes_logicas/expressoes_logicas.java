import java.util.Locale;
import java.util.Scanner;

public class expressoes_logicas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
			
		}
		if(minutos <= 50 && minutos >= 30){ // &&
			
			System.out.println("O valor inserido est� entre 30 e 50");
			
		}
		if(minutos >= 50 || minutos <= 30){ // OU
			
			System.out.println("O valor inserido � maior que 50 OU menor QUE 30");
		}
		if(!(minutos <= 50 || minutos <= 30)){ // "N�O" E "OU"
			
			System.out.println("O valor inserido n�o est� entre 30 e 50");
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();
	}
}