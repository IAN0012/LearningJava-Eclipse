import java.util.Scanner;

public class funcoes_de_sintaxe_java {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a number: ");
			int b = sc.nextInt();
		
		System.out.println("Enter a number: ");
		int c = sc.nextInt();
		
		int higher = max(a, b, c); // Chamada da Função
		
		showResult(higher); // Chamada da Função
		
		sc.close();
	}

	
	public static int max(int x, int y, int z) {// CRIAÇÃO DA FUNÇÃO:

		
		int big;
		
		if(x > y && x > z) {
			big = x;
		}
		else if(y > z) {
			big = y;
		}
		else {
			big = z;
		}
		return big;
	}
	
	public static void showResult(int value){ // CRIAÇÃO DA FUNÇÃO
		System.out.println("Higher: " + value);
	}
	
	
}
