package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String salario1;
		String salario2;
		String salario3;

		//o Comando .replace() muda quando o usuario colcoa "," para "."
		System.out.println("Digite o valor do seu primeiro mês de salario: ");
		salario1 = scan.next().replace(",", ".");
		System.out.println("Digite o valor do seu segundo mês de trabalho:");
		salario2 = scan.next().replace(",", ".");
		System.out.println("Digite o valor do seu terceiro mês de trabalho:");
		salario3 = scan.next().replace(",", ".");

		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);

		double soma = (sal1 + sal2 + sal3) / 3;

		System.out.println("A média dos salários é R$" + soma);

		scan.close();
	}
}