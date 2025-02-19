package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		/*int x = 3 * 4 - 10;
		int y = (int) Math.pow(x , 3);
		double z = Math.pow(x, 3);
		
		System.out.println(y);
		System.out.println(z);*/
		
		//Math.pow serve para fazer um numero elevado a quanto vc quiser
		
		//Resposta
		
		//Part 1 da resposta
		int a = 6 * (3+2);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		int soma = b / c;
		
		//Part 2 da resposta
		int d = (1-5) * (2 -7);
		int f = 2;
		int soma2 = d / f;
		int e = (int) Math.pow(soma2, 2);
		
		//Part 3 da resposta
		int soma3 = soma - e;
		int g = (int) Math.pow(soma3,3);
		int h = (int) Math.pow(10, 3);
		int res = g / h; 
		
		//Parte final da resposta
		System.out.println("A resposta da soma é de " +  res);	
	}
}