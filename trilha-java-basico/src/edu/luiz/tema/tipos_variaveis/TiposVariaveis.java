package edu.luiz.tema.tipos_variaveis;

public class TiposVariaveis {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
      
        byte idade = 123;
        short ano = 2024;
        int cep = 12345678; //int e long podem apresentar erros de compilação se iniciarem com 0.
        long cpf = 123456789L; //Precisa de um l ao final do dado.
        float pi = 3.14F; // como o long precisa de um f ao final para indentificar e nao cometer erros de declaracao.
        double salario = 1600.50;

        // erros de declaração como resolver.
        short numeroCurto = 1;
        int numeroInteiro = numeroCurto;
        short numeroCurto2 = (short) numeroInteiro;

    }
}
