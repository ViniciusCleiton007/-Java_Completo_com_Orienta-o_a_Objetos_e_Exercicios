package Sesao6;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        // Funções built in de String

        String frase = "Java é muito bom!";

        // lenght
        System.out.println(frase.length());

        // int => inteiro
        // String => S => letra maiscula inicial => Classe

        System.out.println(frase.substring(0, 4));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.replace("a", "e"));

        String fraseModificada = frase.toUpperCase();

        System.out.println(fraseModificada);
        System.out.println(frase.toLowerCase());

        // Funções de math

        // Calcula raíz quadrada de um número
        System.out.println(Math.sqrt(26));
        System.out.println(Math.sqrt(9));

        // Calcula a potência de um número
        System.out.println(Math.pow(2,3));

        // me da o valor absoluto de um número
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        // retorna o maior valor de doiís números
        System.out.println(Math.max(100, 10));

        double raizQuadrada = Math.sqrt(99);

        System.out.println("A raiz quadrada de 99 é: " + raizQuadrada);
    }
}
