/* 1. Escreva um código que receba o nome e o ano de
 nascimento de alguém e imprima na tela a seguinte mensagem:
 "Olá 'Fulano' você tem 'X' anos" */

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Exercício 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2026 - anoNascimento;
        System.out.printf("Olá, %s, você tem: %d anos.", nome, idade);
        sc.close();
    }
}
