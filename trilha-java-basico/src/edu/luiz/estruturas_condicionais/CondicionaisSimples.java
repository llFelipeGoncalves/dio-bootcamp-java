package edu.luiz.estruturas_condicionais;

public class CondicionaisSimples {
    public static void main(String[] args) {
        double saldo = 25.5; 
        double valorSolicitado = 17.5; 
        
        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado ;
        }
        
        System.out.println(saldo);
    }
}
