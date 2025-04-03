package JavaCore;

public class ExerciciosOpNote {

    public static void main(String[] args) {

        boolean r1 = 15 - 5 * 2 > (3 - 1) / 2 && 4 <= 2 * 2 || !(2 != 4);
        System.out.println(r1);

        // Crie um programa que calcula a média das notas de um aluno.
        // São 3 notas, e elas dem ser fornecidas pelo usuário.
        // Dica: a conversão de String para Double pode ser feita com o uso do metodo Double.parseDouble()

        var scanner = new java.util.Scanner(System.in);

  //      System.out.print("Nota 1: ");
  //      String nota1 = scanner.nextLine();
  //      double nota1Double = Double.parseDouble(nota1);

        // Para simplificar esse codigo podemos fazer o seguinte

        System.out.print("Nota 1: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota 2: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota 3: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double avg = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média do aluno: " + avg);



    }
}
