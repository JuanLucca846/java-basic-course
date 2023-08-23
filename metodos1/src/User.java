public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal : " + smartTv.canal);

        System.out.println("Tv ligada ? " + smartTv.ligada);

        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);

    }
}
