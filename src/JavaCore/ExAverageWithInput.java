package JavaCore;

public class ExAverageWithInput {

    public static void main(String[] args) {

        // Escreva um programa que calcula a média de notas de um aluni.
        // As notas devem ser fornecidas via teclado pelo user.
        // O user pode fornecer quantas notas desejar
        // Quando um ENTER for pressionado sem fornecer uma nota, o programa calcula a média das notas fornecidas previamente e termina.

        var scanner = new java.util.Scanner(System.in);
        int n = 1;
        double sum = 0.0;

        while (true) {
            System.out.print("Digite a nota " + n + ": ");

            String line = scanner.nextLine();
            if (line.isBlank()) {
                n--;
                break;
            }

            sum += Double.parseDouble(line);

            n++;
        }

        double avg = sum / n;
        System.out.println(n + " nota(s) fornercida(s)");
        System.out.println("A média é: " + avg);

    }
}
