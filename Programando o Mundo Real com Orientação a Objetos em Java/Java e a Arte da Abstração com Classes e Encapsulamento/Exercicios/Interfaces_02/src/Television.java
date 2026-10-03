public class Television implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Television turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television turned off");
    }
}
