public class Main {
    public static void main(String[] args){
        Payment payment1 = new Pix();
        Payment payment2 = new CreditCard();
        Payment payment3 = new Payment();
        Payment payment4 = new Boleto();

        payment1.setValue(100);
        payment1.processPayment();
        payment2.setValue(100);
        payment2.processPayment();

        payment3.setValue(300);
        payment3.processPayment();

        payment4.setValue(400);
        payment4.processPayment();
        payment4.calculateFee();
    }
}
