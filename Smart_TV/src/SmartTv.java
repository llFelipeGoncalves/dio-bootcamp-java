public class SmartTv {
    boolean ligada =false;
    int canal =1;
    int volume =25;

    // ligar e desligar 
    public void ligarTV(){
        ligada = true;
    }
    public void deligarTV(){
        ligada = false;
    }

    // aumentar ou abaixar volume 
    public void aumentarVolume(){
        // volume = volume + 1;
        volume++;
        System.out.println(volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println(volume);
    }

    // aumentar ou abaixar e mudar o canal
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int mudarCanal){
        canal = mudarCanal;
    }
}
