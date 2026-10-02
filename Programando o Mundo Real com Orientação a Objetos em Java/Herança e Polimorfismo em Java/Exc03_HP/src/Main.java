public class Main {
    public static void main(String[] args) {

        RelogioBrasileiro relogioBrasileiro = new RelogioBrasileiro();

        relogioBrasileiro.setHora(18);
        relogioBrasileiro.setMinuto(45);
        relogioBrasileiro.setSegundo(30);

        System.out.println("Relógio Brasileiro:");
        System.out.println(relogioBrasileiro.getHoraFormatada());


        RelogioAmericano relogioAmericano = new RelogioAmericano();

        relogioAmericano.ajustarHorario(relogioBrasileiro);

        System.out.println("Relógio Americano:");
        System.out.println(relogioAmericano.getHoraFormatada());
    }
}