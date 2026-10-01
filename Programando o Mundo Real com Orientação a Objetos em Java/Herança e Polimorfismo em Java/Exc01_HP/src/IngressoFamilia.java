public final class IngressoFamilia extends Ingresso {

    private int qtdePessoas;

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    @Override
    public double calcularValor() {
        double valorTotal = getValor() * getQtdePessoas();
        if (getQtdePessoas() > 3) {
            double desconto = valorTotal / 100 * 5; // 5%
            return valorTotal - desconto;
        } else {
            return valorTotal;
        }
    }
}
