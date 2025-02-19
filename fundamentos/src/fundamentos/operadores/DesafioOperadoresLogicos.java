package fundamentos.operadores;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		boolean trabalho1 = true;
		boolean trabalho2 = false;

		boolean ComprouTv50 = trabalho1 && trabalho2;
		boolean ComprouTv32 = trabalho1 ^ trabalho2;
		boolean ComprouSorvete = trabalho1 || trabalho2;

		// Operador Unário!
		boolean maisSaudavel = !ComprouSorvete;

		System.out.println("Comrprou Tv 50\"? " + ComprouTv50);
		System.out.println("Comrprou Tv 32\"? " + ComprouTv32);
		System.out.println("Comrprou Tv 32\"Sorvete? " + ComprouSorvete);

		// Operador Unário!
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}