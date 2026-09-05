import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.printf("%s tem %d anos e pode dirigir \n", nome, idade);
        } else {
            System.out.printf("%s tem %d anos e não pode dirigir \n", nome, idade);
        }
    }
}
