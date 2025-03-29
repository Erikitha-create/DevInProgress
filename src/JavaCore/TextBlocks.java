package JavaCore;

public class TextBlocks {

    public static void main(String[] args) {

        System.out.println("Olá,\ntudo\nbem");

        System.out.println("Olá,\n  tudo\n    bem");

        String s = """
                Olá
                    Tudo
                        Bem?""";

        System.out.println(s);
    }
}
