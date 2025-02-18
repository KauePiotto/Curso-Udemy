package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String salario1;
		String salario2;
		String salario3;

		System.out.println("Digite o valor do seu primeiro mês de salario: ");
		salario1 = scan.next();
		System.out.println("Digite o valor do seu segundo mês de trabalho:");
		salario2 = scan.next();
		System.out.println("Digite o valor do seu terceiro mês de trabalho:");
		salario3 = scan.next();

		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);

		double soma = sal1 + sal2 + sal3;

		System.out.println("A soma dos três salários é R$" + soma);
		System.out.println("A média dos três salários é R$" + soma);

		scan.close();
	}
}