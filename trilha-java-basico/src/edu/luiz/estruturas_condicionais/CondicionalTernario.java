package edu.luiz.estruturas_condicionais;

public class CondicionalTernario {
    public static void main(String[] args) {
        double nota = 4 ;
        String resultado = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println("Sua situação atual é: " + resultado);
    }
}
