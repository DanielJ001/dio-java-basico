public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
            System.out.println("A TV está ligada? " + smartTv.ligada);
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
            System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);
        smartTv.desligar ();
            System.out.println("Novo status - A TV está desligada? " + smartTv.ligada);

        smartTv.volume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.volume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(10);
            System.out.println("Canal atual: " + smartTv.canal);
    }
}
