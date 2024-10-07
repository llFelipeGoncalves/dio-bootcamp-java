public class DeclarandoVariaveisMetodos {
    public static void main(String[] args) {
        
        String primeiroNome = "Luiz Felipe" ;
        String segundoNome = "Gonçalves" ;

        String MeuNomeCompleto = MeuNomeCompleto(primeiroNome, segundoNome) ;

        System.out.println(MeuNomeCompleto);

    }
    public static String MeuNomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome + (" ") + segundoNome ; 
    }
}
