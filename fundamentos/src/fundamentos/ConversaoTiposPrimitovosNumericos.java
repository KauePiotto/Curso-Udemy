package fundamentos;

public class ConversaoTiposPrimitovosNumericos {
	public static void main(String[] args) {
		//Conversão implícita
		double a = 1;
		System.out.println(a);
		
		//Converão Explícita (cast)
		float b = (float) 1.12345678;
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; //Conversão Expllícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999999;
		int f = (int) e;
		System.out.println(f);
	}
}