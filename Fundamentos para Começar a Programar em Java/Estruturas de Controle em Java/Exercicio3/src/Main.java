/* Escreva um código que o usuário entre com um primeiro número,
um segundo número maior que o primeiro e escolhe entre a opção
 par e impar, com isso o código deve informar todos os números pares
 ou ímpares (de acordo com a seleção inicial) no intervalo de
  números informados, incluindo os números informados e em ordem decrescente;
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 3");
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número, que deve ser maior que o primeiro:");
        int n2 = sc.nextInt();
        if (n1 >= n2) {
            System.out.println("O segundo número deve ser maior que o primeiro, tente novamente.");
        } else {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Par");
            System.out.println("2 - Ímpar");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = n2; i >= n1; i--) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                    case 2:
                        for (int i = n2; i >= n1; i--) {
                            if (i % 2 == 1) {
                                System.out.println(i);
                            }
                        }
                        break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}
