public class Main {
    public static void main(String[] args) {

                Tributavel alimento = new Alimentacao();
                Tributavel vestuario = new Vestuario();
                Tributavel saude = new SaudeBemEstar();
                Tributavel cultura = new Cultura();


                double precoAlimento = 200;
                double precoVestuario = 150;
                double precoSaude = 1500;
                double precoCultura = 50;


                System.out.println("O preço do alimento é R$: " + precoAlimento);
                System.out.println("O valor do imposto do alimento é R$: " + alimento.calcularImposto(precoAlimento));
                System.out.println();


                System.out.println("O preço da saúde é R$: " + precoSaude);
                System.out.println("O valor do imposto da saúde é R$: " + saude.calcularImposto(precoSaude));
                System.out.println();


                System.out.println("O preço do vestuário é R$: " + precoVestuario);
                System.out.println("O valor do imposto do vestuário é R$: " + vestuario.calcularImposto(precoVestuario));
                System.out.println();


                System.out.println("O preço da cultura é R$: " + precoCultura);
                System.out.println("O valor do imposto da cultura é R$: " + cultura.calcularImposto(precoCultura));
            }
        }