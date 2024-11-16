package Sesao4;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 1

        System.out.println("Insira o valor do produto");


        double valorProduto = sc.nextDouble();
        sc.nextLine();

        if (valorProduto < 50){
            System.out.println("Categoria: Barato");
        } else if (valorProduto <= 100) {
            System.out.println("Categoria: Médio");
        } else {
            System.out.println("Categoria: Caro");
        }

        // Exercicio 2

        System.out.println("Insira o nome de usuário: ");
        String usuario = sc.nextLine();

        System.out.println("Insira a senha: ");
        String senha = sc.nextLine();

        if ( usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Acesso permitido!");
        }else {
            System.out.println("Acesso negado!");
        }

         // Exercicio 3

        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        sc.nextLine();

        String resultado = "";
        if (num % 2 == 0){
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("O número é " + resultado);

        // Exercicio 4

        System.out.println("Insira um valor de 1 a 7 (Referente ao dia da semana): ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Final de semana: Domingo");
                break;
            case 2:
                System.out.println("Dia útil: Segunda-Feira");
                break;
            case 3:
                System.out.println("Dia útil: Terça-Feira");
                break;
            case 4:
                System.out.println("Dia útil: Quarta-Feira");
                break;
            case 5:
                System.out.println("Dia útil: Quinta-Feira");
                break;
            case 6:
                System.out.println("Dia útil: Sexta-Feira");
                break;
            case 7:
                System.out.println("Final de semana: Sábado");
                break;
            default:
                System.out.println("Número não encontrado. Digite um número de 1 a 7!");
        }

        // Exercicio 5

        System.out.println("Insira um número: ");
        int valor = sc.nextInt();

        if (valor >= 10 && valor <= 20){
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

         // Exercicio 6

        System.out.println("Insira uma letra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }

        sc.close();

    }

}
