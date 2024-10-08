public class Usuario {
    public static void main(String[] args) throws Exception {        
        SmartTv smartTv = new SmartTv(); // variavel instanciando classe SmartTv.

        // status inicial
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal da TV: " + smartTv.canal);
        System.out.println("Volume da TV: " + smartTv.volume);

        // ligar e deligar
        smartTv.ligarTV();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.deligarTV();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        // aumentar e abaixar volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        // mudar de canal
        smartTv.mudarCanal(16);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
    }
}
