public final class Atendente extends Usuario {

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    private double valorCaixa;

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void receberPagamento(double valor){
        valorCaixa = valorCaixa + valor;
    }

    public double fecharCaixa(){
        return valorCaixa;
    }
}
