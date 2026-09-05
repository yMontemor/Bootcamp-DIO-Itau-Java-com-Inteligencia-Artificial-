import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, informe seu nome: ");
        String name = sc.nextLine();
        System.out.println("Olá, informe sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Olá " + name + ", você tem " + idade + " anos");
    }
}
