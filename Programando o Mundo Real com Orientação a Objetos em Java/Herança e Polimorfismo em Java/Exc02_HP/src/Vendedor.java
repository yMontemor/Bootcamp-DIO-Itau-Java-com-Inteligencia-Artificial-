public final class Vendedor extends Usuario {

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    private int quantidadeVendas;

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda(){
        System.out.println("A venda foi realizada com sucesso.");
        quantidadeVendas = quantidadeVendas + 1;
    }

    public int consultarVendas(){
        return quantidadeVendas;
    }
}
