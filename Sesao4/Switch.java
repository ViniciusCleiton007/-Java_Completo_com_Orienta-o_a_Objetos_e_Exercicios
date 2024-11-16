package Sesao4;

public class Switch {

    public static void main(String[] args) {
        // SWITCH

        // Para validar dia de semana, baseado no número
        //1 = domingo
        //7 = sábado


        int diaDaSemana = 1;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia não existe!");
                break;
        }

        // default é o else do switch

        // Se fosse usar IF, fica:
        // if(diaDaSemana == 1) {} else if (diaDaSemana == 2) {} ...
    }

}
