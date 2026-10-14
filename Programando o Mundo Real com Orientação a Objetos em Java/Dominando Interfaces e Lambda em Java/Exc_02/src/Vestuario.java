public class Vestuario implements Tributavel {

    @Override
    public double calcularImposto(double precoProduto){
        return precoProduto *  0.025;
    }

}
