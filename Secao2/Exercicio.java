package Secao2;

public class Exercicio {

    public static void main (String[] args){

        //Exercicio 1
        int valor = 10;
        int dobroValor = valor * 2;
        System.out.println(dobroValor);

        //Exercicio 2
        char letra = 'B';
        int valorAscii = (int) letra;
        System.out.println(valorAscii);

        //Exercicio 3
        double valores1 = 15.75, valores2 = 20.40;
        double resultado = valores1 + valores2;
        System.out.println(resultado);

        //Exercicio 4
        long numeroLong = 2_000_000_000;
        int castingInt = (int) numeroLong;
        System.out.println(numeroLong);

        //Exercicio 5
        String texto = "Olá, Mundo!";
        String texto2 = texto + " Bem-vindo ao Java!";
        System.out.println(texto2);
    }
}
