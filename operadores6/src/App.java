public class App {
    public static void main(String[] args) throws Exception {
        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("as duas condicoes sao verdadeiras ? ");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma das condicoes é verdadeira ? ");
        }

        System.out.println("Fim");
    }
}
