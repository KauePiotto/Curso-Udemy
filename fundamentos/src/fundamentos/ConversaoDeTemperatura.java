package fundamentos;

import java.util.Scanner;

public class ConversaoDeTemperatura {
	public static void main(String[] args) {
		/*Formula usada nesse Desafio (ºF - 32) * 5 / 9 = ºC]
		*Colocar o 32 de uma constante de nome ajuste
		* 5 e 9 de x e y
		*/

		Scanner scan = new Scanner(System.in);
		double f = 0 ;
		double c ;
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;

		System.out.println("Informe a temperatura em Fahrenheit");
		f = scan.nextDouble();

		c = (f - AJUSTE) * FATOR;

		System.out.println("O resultado é " + c + " ºC");
	}
}