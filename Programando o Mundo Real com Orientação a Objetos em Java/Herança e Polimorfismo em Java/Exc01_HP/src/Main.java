public class Main {
    public static void main(String[] args) {

        // Ingresso normal
        Ingresso ingresso1 = new Ingresso();

        ingresso1.setValor(40);
        ingresso1.setNomeFilme("Avatar");
        ingresso1.setDublado(true);

        System.out.println("Ingresso normal: R$ " + ingresso1.calcularValor());


        // Meia entrada
        Ingresso ingresso2 = new MeiaEntrada();

        ingresso2.setValor(40);
        ingresso2.setNomeFilme("Avatar");
        ingresso2.setDublado(true);

        System.out.println("Meia entrada: R$ " + ingresso2.calcularValor());


        // Ingresso família
        IngressoFamilia ingresso3 = new IngressoFamilia();

        ingresso3.setValor(40);
        ingresso3.setNomeFilme("Avatar");
        ingresso3.setDublado(false);
        ingresso3.setQtdePessoas(4);

        System.out.println("Ingresso família: R$ " + ingresso3.calcularValor());
    }
}