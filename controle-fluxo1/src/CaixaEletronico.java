public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valoSolicitado = 50.0;

        if (valoSolicitado < saldo) {
            saldo = saldo - valoSolicitado;
            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
}
