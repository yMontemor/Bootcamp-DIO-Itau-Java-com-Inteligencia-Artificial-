import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacao = scanner.nextLine();

        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.
        boolean operacaoValida = false;

        // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.
            if (operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA")) {
                operacaoValida = true;
            } else {
                operacaoValida = false;
            }
                System.out.println(operacaoValida ? "VALID" : "INVALID");
        scanner.close();
    }
}