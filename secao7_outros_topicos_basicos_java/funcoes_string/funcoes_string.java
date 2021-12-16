
public class funcoes_string {

	public static void main(String[] args) {
	
		String original = " abcde FGHIJ ABC abc DEFG   ";
		
		String funcao_01 = original.toLowerCase(); // Tudo minúsculo
		String funcao_02 = original.toUpperCase(); // Tudo MAIÚSCULO
		String funcao_03 = original.trim(); // EXCLUI ESPAÇOS ADJACENTES
		String funcao_04 = original.substring(2); // Aparece do char 2 em diante (começa no 0)
		String funcao_05 = original.substring(2, 9); // Aparece do char 2 até o anterior ao 9
		String funcao_06 = original.replace('a', 'x'); //TROCA O QUE SE PEDE
		String funcao_07 = original.replace("abc", "xy"); // TROCA O QUE SE PEDE
		int funcao_08 = original.indexOf("bc"); // 1° posição do que se pede
		int funcao_09 = original.lastIndexOf("bc"); // Última posição do que se pede
		
		System.out.println("Original: -"+ original + "-");
		System.out.println("toLowerCase: -" + funcao_01 + "-");
		System.out.println("toUpperCase: -" + funcao_02 + "-");
		System.out.println("trim: -" + funcao_03 + "-");
		System.out.println("Substring(2): -" + funcao_04 + "-");
		System.out.println("Substring(2, 9): -" + funcao_05 + "-");
		System.out.println("Replace('a', 'x'): -" + funcao_06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + funcao_07 + "-");
		System.out.println("Index of 'bc': "+ funcao_08);
		System.out.println("Last index of 'bc': "+ funcao_09);
		
		
		
		
	}

}
