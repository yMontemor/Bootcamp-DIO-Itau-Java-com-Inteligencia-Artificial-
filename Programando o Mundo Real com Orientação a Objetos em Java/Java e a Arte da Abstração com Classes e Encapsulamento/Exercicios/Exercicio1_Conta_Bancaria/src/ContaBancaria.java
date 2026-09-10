public class ContaBancaria {
    private double saldo;
    private double chequeEspecial; // limite total
    private double chequeEspecialUsado; // quanto já foi usado

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        if (this.saldo <= 500){
            this.chequeEspecial = 50;
        }
        else {
            this.chequeEspecial = saldo / 2;
        }
        this.chequeEspecialUsado = 0;
    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public double verificarChequeEspecial(){
        return this.chequeEspecial;
    }

    public void depositarDinheiro(double valor){
        if (valor > 0 ){
            this.saldo = this.saldo + valor;
        }
    }

    public void sacarDinheiro(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }
        else if (valor > this.saldo &&
                this.saldo + (chequeEspecial - chequeEspecialUsado) >= valor)
        {
            this.chequeEspecialUsado += valor - this.saldo;
            this.saldo = 0;
        }
    }
}
