/* Escreva um código onde o usuário informa um número inicial,
posteriormente irá informar outros N números, a execução do código
irá continuar até que o número informado dividido pelo primeiro número
tenha resto diferente de 0 na divisão, números menores que o
primeiro número devem ser ignorados */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercício 4");
        System.out.println("Digite um número inicial: ");
        int numInicial = sc.nextInt();
        int num2;
        do {
            System.out.println("Digite outro número: ");
            num2 = sc.nextInt();

        } while (num2 < numInicial || num2 % numInicial == 0);

        System.out.println("Número não divisível pelo número inicial. Programa encerrado.");

        sc.close();
    }
}
