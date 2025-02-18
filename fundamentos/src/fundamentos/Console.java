package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		//Escreve tudo na mesma linha
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		//Cada println ele pula uma linha
		System.out.println("Bom");
		System.out.println("dia!");
		
		//O printf é o print formatado
		System.out.printf("Megasena: %d %d %d %d %d %d %n",1,2,3,4,5,6);
		System.out.printf("Nome: %s%n", "João");
		
		//Uso do scanner para receber as informações do teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scan.nextLine();		
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		// scan.nextLine(); lê o "\n" que o scan.nextInt() deixa para trás.
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		scan.close();
	}
}