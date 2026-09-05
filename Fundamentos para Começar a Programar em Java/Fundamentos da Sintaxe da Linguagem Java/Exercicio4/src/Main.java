/* 4. Escreva um código que receba o nome e a idade de 2 pessoas
 e imprima a diferença de idade entre elas.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 4");
        System.out.println("Digite seu nome: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade2 = sc.nextInt();
        int difIdade = 0;
            if (idade1 > idade2) {
                difIdade = idade1 - idade2;
            } else if (idade2 > idade1) {
                difIdade = idade2 - idade1;
            } else {
                System.out.println("As idades são iguais");
            }
        System.out.println("A diferença de idade entre as pessoas é: " + difIdade);
        sc.close();
    }
}
