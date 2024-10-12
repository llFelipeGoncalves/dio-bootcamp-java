package edu.luiz.estruturas_condicionais;

public class CondicionaisCompostas {
    public static void main(String[] args) {
        double nota = 7;

        if (nota >= 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
        double saldo = 25.5; 
        double valorSolicitado = 26; 
        
        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado ;
            System.out.println("Novo saldo "+saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        
    }
}
