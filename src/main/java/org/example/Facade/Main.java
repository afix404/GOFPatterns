package org.example.Facade;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        CryptoPayment cryptoPaymen = new CryptoPayment();
        PaymentFacade paymentFacade = new PaymentFacade(creditCardPayment,cryptoPaymen,payPalPayment);

        paymentFacade.payWithCrypto("bebebe", 111);
        paymentFacade.payWithCard(111111);
        paymentFacade.payWithPayPal(51);

    }
}
