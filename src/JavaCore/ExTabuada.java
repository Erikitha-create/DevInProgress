package JavaCore;

public class ExTabuada {

    public static void main(String[] args) {

        // Escreva um programa que gera a tabuada de um número.
        // O número deve ser fornecido pelo user.
        // Os Valores na tabuada devem variar de 1 a 10.

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
