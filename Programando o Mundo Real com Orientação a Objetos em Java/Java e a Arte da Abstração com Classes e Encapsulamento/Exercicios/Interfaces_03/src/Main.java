import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<User> users =  List.of(new User("Maria", 21), new User("João", 40),
                new User("Eduardo", 25),  new User("Julia", 30));


        var consumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };
        users.forEach(consumer);

        users.forEach(user -> System.out.println(user));
    }
}
