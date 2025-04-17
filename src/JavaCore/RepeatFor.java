package JavaCore;

public class RepeatFor {

    public static void main(String[] args) {

        System.out.println("Exemplo 01");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Exemplo 02");
        int f = 2;

        for (; f < 20; f++) {
            System.out.println(f);
        }
        System.out.println("Exemplo 03");
        int j, h;
        for (j = 0, h = 9; j < 10; j++, h--) {
            System.out.println(j + " - " + h);
        }
    }
}
