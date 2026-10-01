public sealed class Payment
    permits Pix, CreditCard, Boleto {

    private double value;

    public double getValue(){
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void processPayment(){
        System.out.println("Pagamento realizado no valor de R$: " + getValue());
    }

    public double calculateFee(){
        return getValue() / 100;
    }
}
