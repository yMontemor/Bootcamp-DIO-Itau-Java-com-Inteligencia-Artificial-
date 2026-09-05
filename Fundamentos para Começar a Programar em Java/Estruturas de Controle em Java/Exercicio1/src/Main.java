/*
Escreva um código onde o usuário entra
com um número e seja gerada a tabuada de 1 até 10 desse número;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int tabuada = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, tabuada);
        }
        sc.close();
    }
}
