import java.util.Locale;
import java.util.Scanner;

public class entrada_dados_pt1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// Para ler v�rios dados na mesma linha

		String x, e;
		int y;
		double z;
		char c;

		x = sc.next(); // L� SOMENTE A PRIMEIRA PALAVRA
		y = sc.nextInt();
		z = sc.nextDouble();
		c = sc.next().charAt(0);//S� RECEBE A PRIMEIRA LETRA
		sc.nextLine(); // CONSOME O ENTER PARA SE ESCREVER NA PR�XIMA LINHA
		e = sc.nextLine(); // L�  A LINHA TODA
		sc.close();
		
		System.out.println("Os valores s�o: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		System.out.println(e);
		
	}

}