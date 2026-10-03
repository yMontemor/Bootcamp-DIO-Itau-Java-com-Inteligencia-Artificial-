public class Main {
    public static void main(String[] args) {
        Switchable television = new Television();
        Switchable lamp = new Lamp();

        television.turnOn();
        television.turnOff();

        System.out.println();

        lamp.turnOn();
        lamp.turnOff();
    }
}
