public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void volume(){
        System.out.println("O volume atual é de: " + volume);
    }
    public void aumentarVolume(){
        volume++;
            System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
            System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
            System.out.println("Você subiu para o canal: " + canal);
    }
    public void descerCanal(){
        canal--;
            System.out.println("Você desceu para o canal: " + canal);
    }
}
