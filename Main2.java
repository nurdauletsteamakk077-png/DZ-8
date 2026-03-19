public class Main2 {
    public static void main(String[] args) {

        IPaymentProcessor paypal = new PayPalPaymentProcessor();
        IPaymentProcessor stripe = new StripePaymentAdapter();
        IPaymentProcessor crypto = new CryptoPaymentAdapter();

        paypal.processPayment(100);
        stripe.processPayment(200);
        crypto.processPayment(300);
    }
}
