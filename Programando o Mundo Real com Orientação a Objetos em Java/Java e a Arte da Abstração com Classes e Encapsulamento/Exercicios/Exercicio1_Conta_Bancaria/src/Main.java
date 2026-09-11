public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(400);

        System.out.println("=== CONTA CRIADA ===");
        System.out.println("Saldo: R$ " + conta.verificarSaldo());
        System.out.println("Cheque especial: R$ " + conta.verificarChequeEspecial());
        System.out.println("Usando cheque especial? " + conta.verificarUsoChequeEspecial());

        System.out.println("\n=== SAQUE DE R$ 430 ===");
        conta.sacarDinheiro(430);

        System.out.println("Saldo: R$ " + conta.verificarSaldo());
        System.out.println("Cheque especial usado: R$ " + conta.verificarChequeEspecialUsado());
        System.out.println("Taxa do cheque especial: R$ " + conta.verificarTaxaChequeEspecial());
        System.out.println("Usando cheque especial? " + conta.verificarUsoChequeEspecial());

        System.out.println("\n=== DEPÓSITO DE R$ 20 ===");
        conta.depositarDinheiro(20);

        System.out.println("Saldo: R$ " + conta.verificarSaldo());
        System.out.println("Cheque especial usado: R$ " + conta.verificarChequeEspecialUsado());
        System.out.println("Taxa pendente: R$ " + conta.verificarTaxaChequeEspecial());

        System.out.println("\n=== DEPÓSITO DE R$ 50 ===");
        conta.depositarDinheiro(50);

        System.out.println("Saldo: R$ " + conta.verificarSaldo());
        System.out.println("Cheque especial usado: R$ " + conta.verificarChequeEspecialUsado());
        System.out.println("Taxa pendente: R$ " + conta.verificarTaxaChequeEspecial());
        System.out.println("Usando cheque especial? " + conta.verificarUsoChequeEspecial());

        System.out.println("\n=== PAGAMENTO DE BOLETO DE R$ 30 ===");
        conta.pagarBoleto(30);

        System.out.println("Saldo: R$ " + conta.verificarSaldo());
        System.out.println("Cheque especial usado: R$ " + conta.verificarChequeEspecialUsado());
        System.out.println("Taxa pendente: R$ " + conta.verificarTaxaChequeEspecial());
        System.out.println("Usando cheque especial? " + conta.verificarUsoChequeEspecial());
    }
}