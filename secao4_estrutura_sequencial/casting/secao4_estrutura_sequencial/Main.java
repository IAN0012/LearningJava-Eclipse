package secao4_estrutura_sequencial;
public class Main {

	public static void main(String[] args) {

		float b, B;
		double h, resultado; 
		int area;
		
		b = 6f; // Boa pr�tica � colocar o "f" (de float) na frente do n�mero inserido.
		B = 8f; // Boa pr�tica � colocar o "f" (de float) na frente do n�mero inserido.
		h = 5.0; // Boa pr�tica � colocar o ".0" (de double) na frente do n�mero inserido.
		
		
		resultado = (b + B) / 2f * h; // Resultado �: 35.0
		area = (int) resultado; // CASTING - FOR�A AO QUE VAI ENTRAR SER DO TIPO DA VARI�VEL
		System.out.println(area);
		
	}
}
