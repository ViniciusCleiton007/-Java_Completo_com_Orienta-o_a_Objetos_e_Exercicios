package Sesao5_Projeto_CalculadoraIMC;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Seu IMC é " + IMC + " Classificação: Abaixo do peso!");
        } else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Seu IMC é " + IMC + " Classificação: Peso normal!");
        } else if (IMC >= 25 && IMC < 29.9){
            System.out.println("Seu IMC é " + IMC + " Classificação: Sobrepeso!");
        } else {
            System.out.println("Seu IMC é " + IMC + " Classificação: Obesidade!");
        }


        sc.close();
    }

}
