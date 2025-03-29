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

        int ab = 54;
        int ac = 4;
        int ad = 12;
        int ae = 78;
        int af = ab - a * ad + ( a * 7 ) + ae / ac;
        System.out.println(af);
    }
}
