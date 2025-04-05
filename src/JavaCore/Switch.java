package JavaCore;

public class Switch {

    public static void main(String[] args) {

        int month = 8;
        int days;

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            default:
                days = 0;
                System.out.println("Inválido");

        }

        System.out.println(days + " dias");

        // Para um código mais limpo a partir do Java 14 usa-se o Switch Expression

        int month1 = 14;
        int days1 =switch (month1) {

            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Inválido");
                yield 0;
            }
        };

        System.out.println(days1 + " dias");


        int dia = 1;

        String resultado = switch (dia) {
            case 1 -> {
                System.out.println("Calculando...");
                yield "Domingo";
            }
            case 2 -> "Segunda";
            default -> "Outro dia";
        };

        System.out.println(resultado);

    }
}
