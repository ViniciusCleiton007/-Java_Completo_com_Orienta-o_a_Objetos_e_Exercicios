package Secao2;

import java.util.Scanner;

public class testeScanner {

    public static void main(String[] args) {

        //Testanto Scanner
        //nextLine
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + "!");

        //nextInt
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Idade: " + idade);

        //Problema do nextLine

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite um texto: ");
        String text = sc.nextLine();

        System.out.println("Os dados são, numero = " + numero + " e texto = " + text);

        //fechamento do Scanner, para evitar memory leak
        sc.close();

    }
}
