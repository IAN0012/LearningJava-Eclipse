import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		Locale.setDefault(Locale.US);
		
		 
		
		System.out.println("Ol� Mundo");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		
		// System.out.println("TEM QUEBRA DE LINHA");
		// System.out.print("N�O TEM QUEBRA DE LINHA");
		// System.out.printf("SERVE PARA FORMATAR");
		// %s = TEXTO
		// %d = INTEIRO
		// %f = PONTO FLUTUANTE
		// %n = QUEBRA DE LINHA
	}
	
}
