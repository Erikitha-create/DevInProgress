package JavaCore;

public class EXEvenSum {

    public static void main(String[] args) {

        // Escreva um programa que soma todos os número pares do intervalo entre 0 e 100.

        int i;
        int sun = 0;
        for (i = 0; i <= 100; i++) {
            sun += i % 2 == 0 ? i : 0;
        }

        System.out.println(sun);
    }
}
