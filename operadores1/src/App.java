public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // atribuir valor =
        String nome = "Juan";

        // aritmético + - * /
        double soma = 10.5 + 15.7;
        int sub = 113 - 25;
        int multi = 20 * 7;
        int div = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // operador + também faz concatenação

        String nomeCompleto = "LINGUAGEM" + " JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}
