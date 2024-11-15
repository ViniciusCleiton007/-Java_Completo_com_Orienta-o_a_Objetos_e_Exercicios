package Secao2;

public class Variavel {

    public static void main (String[] args){
        // O que são variáveis
        //tipo -> nome -> atribuir valor;

        //String
        String nome = "Vinicius";
        //Int
        int idade = 24;
        // Char
        char sexo = 'M';

        //nome => "Vinicius"
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);


        // Long

        long populacaoMundial = 780000000000000L;
        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;
        System.out.println(grandeNumero);

        // Double
        double preco = 19.99;
        System.out.println(preco);
        double pi = 3.141_592_123;
        System.out.println(pi);
        double valorComD = 12.1D;
        System.out.println(valorComD);

        //Operador aritmetico

        int adicao = 1 + 2;
        int subtracao = 3 - 2;
        int multiplicacao = 2 * 2;
        int divisao = 10 / 3;
        double restoDivisao = 10 % 3;

        System.out.println(adicao);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(restoDivisao);

        // Incremento e Decremento
        int x = 5;
        x++;
        System.out.println(x);

        int y = 5;
        y--;
        System.out.println(y);

        //Atribuição aditiva e Atribuição subtrativa

        int a = 0, b = 4;


        a += 2;
        b -= 2;

        System.out.println(a);
        System.out.println(b);

        // type casting
        // Implicito (widening)
        int numero = 42;

        long numeroLong = numero;

        double numeroDouble = numero;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        //explicito (narrowing)

        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

        //casting char para int
        char letra = 'A';

        int codigoAscii = (int) letra;
        System.out.println(codigoAscii);

        //Constantes
        final int DIAS_DA_SENMANA = 7;
        System.out.println("Dias da semana: " + DIAS_DA_SENMANA);

        //Var

        var z = 10;
        System.out.println(z);

    }
}
