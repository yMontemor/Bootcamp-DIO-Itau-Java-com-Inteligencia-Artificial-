public sealed class Ingresso
    permits MeiaEntrada, IngressoFamilia {

    private double valor;
    private String nomeFilme;
    private boolean dublado; // se false, legendado.

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }


    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public double calcularValor(){
        return getValor();
    }
}
