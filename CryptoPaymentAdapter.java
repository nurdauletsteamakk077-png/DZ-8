class CryptoPaymentAdapter implements IPaymentProcessor {

    private CryptoPaymentService crypto = new CryptoPaymentService();

    public void processPayment(double amount) {
        crypto.sendCrypto(amount);
    }
}
