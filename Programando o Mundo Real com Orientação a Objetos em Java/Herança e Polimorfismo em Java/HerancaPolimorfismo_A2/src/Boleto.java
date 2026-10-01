public final class Boleto extends Payment {

    private String barCode;

    public String getBarCode(){
        return barCode;
    }

    public void setBarCode(String barCode){
        this.barCode = barCode;
    }

    @Override
    public void processPayment(){
        System.out.println("Boleto: " + getBarCode() + " processado no valor de R$: " + getValue());
    }

    @Override
    public double calculateFee(){
        return 2;
    }
}
