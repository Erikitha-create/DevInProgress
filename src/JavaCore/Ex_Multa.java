package JavaCore;

public class Ex_Multa {

    public static void main(String[] args) {

        // Escreva um programa que calcula o valor de uma multa de trânsito por excesso de velocidade.
        // O valor da multa é R$ 10,00 para cada Km/h da velocidade do veículo considerada e excede a velocidade permitida.
        // A velocidade permitida de ser parametrizável.
        // A velocidade considerada depende da velocidade permitida:
            // Para uma velocidade permitida até 100Km/h, aa velocidade é 7Km/h a mais do que a velocidade do veículo.
            // Para velocidades permitidas acima de 100Km/h, a velocidade considerada é 10% a mais do que a velociade do veículo.

        int allowed = 200;
        int current = 100;
        int amount;

        if (allowed < current) {

            int considered;

            if (allowed < 100) {
                considered = current + 7;
            } else {
                considered = current + (int) (current * 0.1);
            }

            int diff = considered - allowed;
            amount = diff * 10;
        } else {
            amount = 0;
        }

        System.out.println("Value: " + amount);

    }
}
