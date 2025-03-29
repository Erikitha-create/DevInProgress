package JavaCore;

public class OperatorArithmetic {

    public static void main(String[] args) {

        int a = 10;
        int b = a + 5;
        System.out.println(b);

        int c = 25;
        int d = c - b;
        int e = a + b + d;
        System.out.println(e);

        int f = 4;
        double g = (double) e / f;
        double h = (double) g;
        System.out.println(g);
        System.out.println(h);
    }
}
