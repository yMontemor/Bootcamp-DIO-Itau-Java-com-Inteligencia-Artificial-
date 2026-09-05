/*
 3.Escreva um código que receba a base e a altura de um retângulo,
 calcule sua área e exiba na tela.

- Fórmula: área = base × altura */
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Exercício 3");
        System.out.println("Vamos calcular a área de um retângulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
        sc.close();
    }
}
