public final class Pix extends Payment {

     private String pixKey;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey){
        this.pixKey = pixKey;
    }

    @Override
    public void processPayment(){
        System.out.println("Pagamento via PIX no valor de: R$: " + getValue());
    }

    @Override
    public double calculateFee(){
        return 0;
    }
}
