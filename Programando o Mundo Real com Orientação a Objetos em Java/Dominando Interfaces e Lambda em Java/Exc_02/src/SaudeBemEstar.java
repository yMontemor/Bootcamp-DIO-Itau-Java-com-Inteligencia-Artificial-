public class SaudeBemEstar implements Tributavel {

        @Override
    public double calcularImposto(double precoProduto){
            return precoProduto *  0.015;
        }
}
