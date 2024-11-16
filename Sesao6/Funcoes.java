package Sesao6;

public class Funcoes {

    public static void main(String[] args) {

        // Criando primeira função
        // tanto funções como variaveis, a gente nomeia
        saudacao();

        // parametros
        soma(2, 4);
        soma(5,5);

        saudar("Vinicius");

        // return
        dobrar(4);

        int numero = 10;
        int numeroDobrado = dobrar(numero);

        System.out.println("O número dobrado é: " + numeroDobrado);
        System.out.println(dobrar(12));

    }

    // nivel de acesso, static => nao preciso instanciar classe para executar, tipo retorno
    // Nome, parenteses (args), bloco {}
    public static void saudacao (){
        System.out.println("Olá, essa é minha primeira função!");
    }

    public static void saudar (String nome){
        System.out.println("Olá " + nome + ",Tudo bem?");
    }

    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static int dobrar(int n){
        return n * 2;
    }
}
