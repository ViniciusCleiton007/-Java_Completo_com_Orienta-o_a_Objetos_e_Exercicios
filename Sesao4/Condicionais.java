package Sesao4;

public class Condicionais {

    public static void main(String[] args) {

        // o que é boolean
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // operadores de comparação
        int x = 10;

        System.out.println(x == 10);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        // x é maior ou igual a 10
        System.out.println(x >= 10);

        // x é menor que 10
        System.out.println(x < 10);

        // x é menor ou igual a 10
        System.out.println(x <= 10);

        // comparação de Strings
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));

        System.out.println(str2.equals(str1));

        System.out.println(str1.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equals(str3));

        //J ava == JAVA (false) > java == java
        System.out.println(str1.equalsIgnoreCase(str3));

        // IF
        int numero = 10;

        //Baseado em comparação, eu executo algo
        if (numero > 5){
            System.out.println("O número é maior que 5");
        }

        // IF com Strings
        String text = "Teste";

        // Se a função retorna booleano, eu posso usar o IF
        if (text.equals("Teste")){
            System.out.println("O teste é: Teste");
        }

        // Declaração do IF (comparação ou retorno de booleano) {o que será executado... }

        // ELSE
        int q = 7;
        if (q > 10){
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Insira um valor maior que 10");
        }

        // tod o else precisa ter um if, mas nem tod o if precisa de um else

        if (text.equals("Teste2")){
            System.out.println("O teste é: Teste2");
        } else {
            System.out.println("O texto não é igual!");
        }

        // ELSE IF
        double nota = 8.5;

        if (nota == 10){
            System.out.println("Parabens, você tirou a nota máxima");
        } else if (nota >= 9){
            System.out.println("Nota muito boa!");
        }else if (nota >= 7){
            System.out.println("Acima da média");
        }else {
            System.out.println("Abaixo da média");
        }

        int num = 5;

        if (num > 3){
            System.out.println("Alguma coisa");
        }else if (num == 5){
            System.out.println("Alguma outra coisa");
        }
    }

}
