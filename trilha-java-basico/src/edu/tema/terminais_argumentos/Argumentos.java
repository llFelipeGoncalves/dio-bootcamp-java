package edu.tema.terminais_argumentos;
import java.util.Scanner;

public class Argumentos {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = scanner.next();

        System.out.println("meu nome é: " + nome);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Sua idade é: " + idade);
    }    
}
