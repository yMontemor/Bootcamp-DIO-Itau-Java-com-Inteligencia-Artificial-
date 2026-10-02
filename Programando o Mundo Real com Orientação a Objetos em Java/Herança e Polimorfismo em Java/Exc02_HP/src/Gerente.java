public final class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Relatório financeiro gerado ");
    }

    public void consultarVendas(){
        System.out.println("As vendas estão sendo consultadas.");
    }

}
