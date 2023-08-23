public class App {
    public static void main(String[] args) throws Exception {

        String nomeUm = "Juan";
        String nomeDois = new String("Juan");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2) {
            System.out.println("a nossa condicao é verdadeira");
        }

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois ? " + simNao);

    }
}
