public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        // final não permite ser alterado
        // VALOR_DE_PI = 10.75;

        // System.out.println(VALOR_DE_PI);

        // valor_nunca_podera_mudar ?
    }
}
