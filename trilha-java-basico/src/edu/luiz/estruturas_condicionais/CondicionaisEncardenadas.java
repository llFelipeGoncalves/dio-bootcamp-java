package edu.luiz.estruturas_condicionais;

public class CondicionaisEncardenadas {
    public static void main(String[] args) {
        double nota = 6;

        if (nota >= 7){
            System.out.println("APROVADO");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}