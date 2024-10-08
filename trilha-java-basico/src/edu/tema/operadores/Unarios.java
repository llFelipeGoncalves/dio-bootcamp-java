package edu.tema.operadores;

public class Unarios {
    
    public static void main(String[] args) {
        
        int n = 1; // deixar o numero negativo. 
        n = - n ;
        System.out.println("Valor negativo: " + n);

        n = n * -1; 
        System.out.println("Volta valor positivo: " + n);

        int n1 = 1; 
        System.out.println("Valor com incremento: " + ++n1); // ++ incremento.
        int n2 = 1; 
        System.out.println("Valor com decremento: " + --n2); // -- decremento.

        boolean verdadeiro = true; // ! logico de negação.
        System.out.println("Expressao booleana negada: " + !verdadeiro);

        }

    }
