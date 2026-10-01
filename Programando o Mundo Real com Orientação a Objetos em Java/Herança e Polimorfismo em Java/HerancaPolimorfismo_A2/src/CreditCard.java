public final class CreditCard extends Payment {

    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Pagamento via cartão de crédito no valor de R$: " + getValue());
    }

    @Override
    public double calculateFee(){
        return getValue() * 3 / 100;
    }
}
