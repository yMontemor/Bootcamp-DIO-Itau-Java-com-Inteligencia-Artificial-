public class Main {
    public static void main(String[] args) {

        // GERENTE
        Gerente gerente = new Gerente(
                "Carlos",
                "carlos@email.com",
                "12345"
        );

        System.out.println("=== GERENTE ===");
        gerente.realizarLogin();
        System.out.println("Administrador: " + gerente.isAdministrador());
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        gerente.alterarDados("Carlos Silva", "carlos.silva@email.com");
        gerente.alterarSenha("54321");

        System.out.println("Novo nome: " + gerente.getNome());
        System.out.println("Novo e-mail: " + gerente.getEmail());
        gerente.realizarLogoff();


        // VENDEDOR
        Vendedor vendedor = new Vendedor(
                "João",
                "joao@email.com",
                "11111"
        );

        System.out.println("\n=== VENDEDOR ===");
        vendedor.realizarLogin();
        System.out.println("Administrador: " + vendedor.isAdministrador());

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.realizarVenda();

        System.out.println("Quantidade de vendas: " + vendedor.consultarVendas());

        vendedor.alterarDados("João Santos", "joao.santos@email.com");
        System.out.println("Novo nome: " + vendedor.getNome());
        System.out.println("Novo e-mail: " + vendedor.getEmail());

        vendedor.realizarLogoff();


        // ATENDENTE
        Atendente atendente = new Atendente(
                "Maria",
                "maria@email.com",
                "22222"
        );

        System.out.println("\n=== ATENDENTE ===");
        atendente.realizarLogin();
        System.out.println("Administrador: " + atendente.isAdministrador());

        atendente.receberPagamento(100);
        atendente.receberPagamento(75.50);
        atendente.receberPagamento(50);

        System.out.println("Valor em caixa: R$ " + atendente.getValorCaixa());
        System.out.println("Fechamento do caixa: R$ " + atendente.fecharCaixa());

        atendente.realizarLogoff();
    }
}