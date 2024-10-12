package edu.luiz.sintaxe_basica.operadores;

public class Logicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        
        boolean condicao2 = true;
        
        if (condicao1 && condicao2){
            System.out.println("as duas sao verdadeiras");
        }
        
        if (condicao1 || condicao2){
            System.out.println("uma ou outra é verdadeira");
        }

    }
}
