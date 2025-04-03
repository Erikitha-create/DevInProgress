package JavaCore;

public class ExercicioOpTemp {

    public static void main(String[] args) {

        // Escreva um programa que converte o valor de uma temperatura em graus Fahrenheit para graus Celsius.
        // A temperatura deve ser fornecida pelo user

        System.out.print("Temperatura em Fahrenheit: ");
        var scanner = new java.util.Scanner(System.in);
        double tf = Double.parseDouble(scanner.nextLine());
        double tc =  ((tf - 32) / 9) * 5;
        System.out.println("Temperatura em Celcius:" + tc + "ºC");
    }
}
