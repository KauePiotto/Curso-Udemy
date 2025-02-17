package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa")); //Retornara true ou false
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());//Retornara o tamanho da String
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome:"  + nome +
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalario" + salario;
		System.out.println(maisUmaFrase);
		
		//O %s serve para string, o %d para numero inteiro e o %f para numero real(decimal)
		System.out.printf("O Senhor  %s %s tem %d anos e ganha R$%.2f ",nome, sobrenome,idade,salario);		
		
		//System.out.printf serve para formatar a frase a ser escrita
		String frase = String.format("\nO Senhor  %s %s tem %d anos e ganha R$%.2f ",nome, sobrenome,idade,salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}
}