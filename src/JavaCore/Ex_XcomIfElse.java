package JavaCore;

public class Ex_XcomIfElse {

    public static void main(String[] args) {

        // Escreva um programa que imprime na saída os valores assumidos por x.
        // Esta variável x deve iniciar com algum valor escolhido por você.
        // Se c for par, x deve receber o valor dele mesmo somado com 5.
        // Se x for ímpar, x deve receber o valor dele multiplicado por 2.
        // Utilize a estrutura if-else para resolver o exercício.

        int x = 11;

        if (x % 2 == 0) {
            x += 5;
        } else {
            x *= 2;
        }

        System.out.println("X = " + x);
    }
}
