public class ContaBancaria {
    private double saldo;
    private double chequeEspecial; // limite total
    private double chequeEspecialUsado; // quanto já foi usado
    private double taxaChequeEspecial;

    public ContaBancaria(double saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            this.saldo = 0;
        }

        if (this.saldo <= 500){
            this.chequeEspecial = 50;
        }
        else {
            this.chequeEspecial = this.saldo / 2;
        }

        this.chequeEspecialUsado = 0;
        this.taxaChequeEspecial = 0;
    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public double verificarChequeEspecial(){
        return this.chequeEspecial;
    }

    public void depositarDinheiro(double valor) {

        if (valor <= 0) {
            System.out.println("Depósito inválido.");
        }

        else if (chequeEspecialUsado == 0 && taxaChequeEspecial == 0) {
            this.saldo = this.saldo + valor;
        }

        else {
            double dividaTotal = chequeEspecialUsado + taxaChequeEspecial;

            if (valor >= dividaTotal) {

                this.saldo = valor - dividaTotal;

                chequeEspecialUsado = 0;
                taxaChequeEspecial = 0;
            }

            else if (valor <= chequeEspecialUsado) {

                chequeEspecialUsado = chequeEspecialUsado - valor;
                this.saldo = 0;
            }

            else {

                double valorRestante = valor - chequeEspecialUsado;

                chequeEspecialUsado = 0;
                taxaChequeEspecial = taxaChequeEspecial - valorRestante;

                this.saldo = 0;
            }
        }
    }

    public void sacarDinheiro(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }
        else if (valor > this.saldo &&
                this.saldo + (chequeEspecial - chequeEspecialUsado) >= valor)
        {
            double valorUsado = valor - this.saldo;

            this.chequeEspecialUsado += valorUsado;
            this.taxaChequeEspecial += valorUsado * 20 / 100;

            this.saldo = 0;
        } else {
            if (valor > 0){
                System.out.println("Saldo insuficiente para realizar o saque.");
            } else {
                System.out.println("Valor digitado inválido.");
            }
        }
    }

    public void pagarBoleto(double valor){
       if (valor > 0 && this.saldo >= valor){
           this.saldo =  this.saldo - valor;
       } else if (valor > 0 &&
               this.saldo + (chequeEspecial - chequeEspecialUsado) >= valor){

           double valorUsado = valor - this.saldo;

           this.chequeEspecialUsado += valorUsado;
           this.taxaChequeEspecial += valorUsado * 20 / 100;

           this.saldo = 0;

       } else {
           if (valor > 0){
               System.out.println("Saldo insuficiente.");
           } else {
               System.out.println("Valor digitado inválido.");
           }
       }
    }

    public boolean verificarUsoChequeEspecial(){
        if (this.chequeEspecialUsado > 0){
                return true;
        } else {
                return false;
        }
    }

    public double verificarChequeEspecialUsado(){
        return this.chequeEspecialUsado;
    }

    public double verificarTaxaChequeEspecial(){
        return this.taxaChequeEspecial;
    }
}
