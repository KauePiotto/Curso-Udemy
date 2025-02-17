package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replaceAll("X", "Senhora");// Serve para substituir o X por senhora
		s = s.toUpperCase(); // Deixa todas as letras em maiusculo
		s = s.concat("!!!");// Serve para concatenar uma string

		System.out.println(s);

		String x = "Leo".toUpperCase();
		System.out.println(x);

		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
	}
}