package secao4_estrutura_sequencial;
public class Main {

	public static void main(String[] args) {

		float b, B;
		double h, resultado; 
		int area;
		
		b = 6f; // Boa prática é colocar o "f" (de float) na frente do número inserido.
		B = 8f; // Boa prática é colocar o "f" (de float) na frente do número inserido.
		h = 5.0; // Boa prática é colocar o ".0" (de double) na frente do número inserido.
		
		
		resultado = (b + B) / 2f * h; // Resultado é: 35.0
		area = (int) resultado; // CASTING - FORÇA AO QUE VAI ENTRAR SER DO TIPO DA VARIÁVEL
		System.out.println(area);
		
	}
}
