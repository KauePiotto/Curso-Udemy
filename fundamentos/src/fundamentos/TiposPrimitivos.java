package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos numéricos inteiros 
		byte anosDeEmpresa = 23;
		short numerosDeVoo = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;//Coloca a letra L no final para o java entender que é um literal long e não um inteiro
		
		//Tipos numéricos reais
		float salario = 11_445.44F; //Coloca a letra F no final para o java entender que é um literal float e não um double
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo Caractere
		char status = 'A';//Ativo
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Números de viagem
		System.out.println(numerosDeVoo / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->"+salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
}