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
		
		int higher = max(a, b, c); // Chamada da Fun��o
		
		showResult(higher); // Chamada da Fun��o
		
		sc.close();
	}

	
	public static int max(int x, int y, int z) {// CRIA��O DA FUN��O:

		
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
	
	public static void showResult(int value){ // CRIA��O DA FUN��O
		System.out.println("Higher: " + value);
	}
	
	
}
