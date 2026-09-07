import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        Person male = new Person();
        male.setName("João");
        male.setAge(25);

        Person female = new Person();
        female.setName("Maria");
        female.setAge(26);

        System.out.println("Male: " + male.getName() + " has " + male.getAge() + " years old");
        System.out.println("Female: " + female.getName() + " has " + female.getAge() + " years old");

    }
}
