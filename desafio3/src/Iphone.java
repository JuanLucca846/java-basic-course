public class Iphone {
    boolean estado = false;
    String musica = "";

    public void tocar() {

        estado = true;
        System.out.println("Tocando");
    }

    public void pausar() {

        estado = false;
        System.out.println("Pausado");
    }

    public void selecionarMusica(String nomeMusica) {
        musica = nomeMusica;
        System.out.println("Tocando a musica " + nomeMusica);
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendido");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
