package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		//Vai dar true
		System.out.println("2" == "2");
		
		//Vai dar false
		String s1 = new String("2");
		System.out.println("2" == s1);
		//Equals serve para comprar o conteudo e não vai entrar em qualuer outra questão interna da linguagem
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
