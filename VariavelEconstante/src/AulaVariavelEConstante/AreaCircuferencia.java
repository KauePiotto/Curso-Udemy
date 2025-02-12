package AulaVariavelEConstante;
public class AreaCircuferencia {
    public static void main(String[] args) {
        /*
         * Tipos de variaveis em java:
         * 
         * Int = numero inteiro
         * Double = numero decimal
         * 
         * Final serve para nao ter como alterar o valor
         * 
         * Sempre usar nome de constante com letra maiuscula
         */
        double raio = 3.4;
        final double PI = 3.14159;
        double area;

        area = PI * raio * raio;
        
        System.out.println(area);

        raio = 10;

        area = PI * raio * raio;

        System.out.println("Área = " + area + " m2.");

   }
}