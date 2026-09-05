/* 2.Escreva um código que receba
o tamanho do lado de um quadrado,
calcule sua área e exiba na tela.
- Fórmula: área = lado × lado
*/

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();
        double area =  lado * lado;
        System.out.println("A área do quadrado é: " + area);
        sc.close();
    }
}
