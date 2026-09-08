import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        int option;

        do {
            showMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> petMachine.takeShower();

                case 2 -> petMachine.addWater();

                case 3 -> petMachine.addShampoo();

                case 4 -> System.out.println(
                        "Nível de água: " + petMachine.getWater() + " litros"
                );

                case 5 -> System.out.println(
                        "Nível de shampoo: " + petMachine.getShampoo() + " litros"
                );

                case 6 -> checkPet();

                case 7 -> setPetInMachine();

                case 8 -> petMachine.removePet();

                case 9 -> petMachine.wash();

                case 0 -> System.out.println("Programa encerrado.");

                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("\nEscolha uma das opções:");
        System.out.println("1 - Dar banho no pet");
        System.out.println("2 - Abastecer a máquina com água");
        System.out.println("3 - Abastecer a máquina com shampoo");
        System.out.println("4 - Verificar nível de água");
        System.out.println("5 - Verificar nível de shampoo");
        System.out.println("6 - Verificar se tem pet na máquina");
        System.out.println("7 - Colocar pet na máquina");
        System.out.println("8 - Retirar pet da máquina");
        System.out.println("9 - Limpar a máquina");
        System.out.println("0 - Sair");
    }

    private static void setPetInMachine() {
        System.out.println("Digite o nome do pet:");
        String name = sc.nextLine();

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }

    private static void checkPet() {
        if (petMachine.hasPet()) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}