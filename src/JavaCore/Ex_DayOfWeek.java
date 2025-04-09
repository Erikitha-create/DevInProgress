package JavaCore;

public class Ex_DayOfWeek {

    public static void main(String[] args) {

        // Escreva um programa que retorna o nome do dia da semana com base em um número fornecido.
        // O primeiro dia da semana é o DOMINGO, e corresponde ao número 1.
        // Utilize uma estrutura SWITCH para resolver o exercício.

        int n = 8;
        String dow = switch(n) {
            case 1 -> "DOMINGO";
            case 2 -> "SEGUNDA";
            case 3 -> "TERÇA";
            case 4 -> "QUARTA";
            case 5 -> "QUINTA";
            case 6 -> "SEXTA";
            case 7 -> "SÁBADO";
            default -> "DIA INVÁLIDO";
        };

        System.out.println(dow);
    }
}
