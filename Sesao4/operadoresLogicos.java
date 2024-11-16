package Sesao4;

public class operadoresLogicos {

    public static void main(String[] args) {

        // AND

        int idade = 18;
        boolean habilitacao = true;
        boolean habilitacaoVencida = true;

        System.out.println(idade >= 18 && habilitacao == true);
        System.out.println(idade >= 18 && habilitacao && habilitacaoVencida == true);


        int a = 10;
        int b = 20;

        //True && True => True
        if (a > 5 && b > 10){
            System.out.println("Deu certo!");
        }

        //False && True = => True ( Curto Circuito)
        if (a > 55 && b > 10){
            System.out.println("Deu certo2!");
        }

        // OR
        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        System.out.println( false || false);

        System.out.println( 10 > 20 || 100 == 200);

        int idade2 = 16;
        boolean ehMembro = true;

        // O usuario pode participar do clube
        // ele precisa ter mais de 16 ou ser membro

        if (idade2 > 16 || ehMembro){
            System.out.println("Você é membro!");
        }else {
            System.out.println("Entrada negada!");
        }

        // NOT
        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        System.out.println(estaChovendo || !temGuardaChuva);

        System.out.println(!(estaChovendo || !temGuardaChuva));



    }
}
