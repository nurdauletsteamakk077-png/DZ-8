class StripePaymentAdapter implements IPaymentProcessor {

    private StripePaymentService stripe = new StripePaymentService();

    public void processPayment(double amount) {
        stripe.makeTransaction(amount);
    }
}
