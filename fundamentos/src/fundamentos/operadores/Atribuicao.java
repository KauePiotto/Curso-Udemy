package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		//c = c + b;
		//c = c - a;
		//c = c * b;
		//c = c / a;
		//c = c % 2;
		
		//Forma simplificada
		c += b;
		c -= a;
		c *= b;
		c /= a;
		
		//Operador unario de incremneto e funciona como atribuição acresentando mais um valor
		c++; //É a mesma coisa de c = c + 1;
		
		System.out.println(c);
		
		c %= 2;
		
		System.out.println(c);
	}
}