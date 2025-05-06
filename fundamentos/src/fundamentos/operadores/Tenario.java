package fundamentos.operadores;

public class Tenario {
	public static void main(String[] args) {
		double media = 8.6;
		
		//Atribuição Condicional
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto?  " + resultado);
	}
}