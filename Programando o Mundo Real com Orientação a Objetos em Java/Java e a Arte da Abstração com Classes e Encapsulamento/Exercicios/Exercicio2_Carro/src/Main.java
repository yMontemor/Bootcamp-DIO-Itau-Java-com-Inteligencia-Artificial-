public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        // Liga o carro
        carro1.ligar();

        // Ponto morto -> 1ª marcha
        carro1.trocarMarcha(1);

        // 1ª marcha: 0 -> 20 km/h
        for (int i = 0; i < 20; i++) {
            carro1.acelerar();
        }
        System.out.println("Velocidade: " + carro1.verificarVelocidade());

        // 1ª -> 2ª
        carro1.trocarMarcha(2);

        // 2ª marcha: 20 -> 40 km/h
        for (int i = 0; i < 20; i++) {
            carro1.acelerar();
        }
        System.out.println("Velocidade: " + carro1.verificarVelocidade());

        // 2ª -> 3ª
        carro1.trocarMarcha(3);

        // 3ª marcha: 40 -> 60 km/h
        for (int i = 0; i < 20; i++) {
            carro1.acelerar();
        }
        System.out.println("Velocidade: " + carro1.verificarVelocidade());

        // 3ª -> 4ª
        carro1.trocarMarcha(4);

        // 4ª marcha: 60 -> 80 km/h
        for (int i = 0; i < 20; i++) {
            carro1.acelerar();
        }
        System.out.println("Velocidade: " + carro1.verificarVelocidade());

        // 4ª -> 5ª
        carro1.trocarMarcha(5);

        // 5ª marcha: 80 -> 100 km/h
        for (int i = 0; i < 20; i++) {
            carro1.acelerar();
        }
        System.out.println("Velocidade: " + carro1.verificarVelocidade());

        // 5ª -> 6ª
        carro1.trocarMarcha(6);

        // 6ª marcha: 100 -> 120 km/h
        for (int i = 0; i < 20; i++) {
            carro1.acelerar();
        }
        System.out.println("Velocidade máxima: " + carro1.verificarVelocidade());

        // 6ª: 120 -> 101
        for (int i = 0; i < 19; i++) {
            carro1.diminuirVelocidade();
        }
        System.out.println("Velocidade: " + carro1.verificarVelocidade());

        // 6ª -> 5ª
        carro1.trocarMarcha(5);

        // 5ª: 101 -> 81
        for (int i = 0; i < 20; i++) {
            carro1.diminuirVelocidade();
        }

        // 5ª -> 4ª
        carro1.trocarMarcha(4);

        // 4ª: 81 -> 61
        for (int i = 0; i < 20; i++) {
            carro1.diminuirVelocidade();
        }

        // 4ª -> 3ª
        carro1.trocarMarcha(3);

        // 3ª: 61 -> 41
        for (int i = 0; i < 20; i++) {
            carro1.diminuirVelocidade();
        }

        // 3ª -> 2ª
        carro1.trocarMarcha(2);

        // 2ª: 41 -> 21
        for (int i = 0; i < 20; i++) {
            carro1.diminuirVelocidade();
        }

        // 2ª -> 1ª
        carro1.trocarMarcha(1);

        // 1ª: 21 -> 0
        for (int i = 0; i < 21; i++) {
            carro1.diminuirVelocidade();
        }

        System.out.println("Velocidade final: " + carro1.verificarVelocidade());

        // 1ª -> ponto morto
        carro1.trocarMarcha(0);

        // Desligar
        carro1.desligar();
    }
}