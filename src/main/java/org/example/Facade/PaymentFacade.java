package org.example.Facade;

public class PaymentFacade {
    CreditCardPayment creditCardPayment;
    CryptoPayment cryptoPayment;
    PayPalPayment payPalPayment;

    public PaymentFacade(CreditCardPayment creditCardPayment, CryptoPayment cryptoPayment, PayPalPayment payPalPayment) {
        this.creditCardPayment = creditCardPayment;
        this.payPalPayment = payPalPayment;
        this.cryptoPayment = cryptoPayment;
    }
    void payWithCard(double amount){
        creditCardPayment.pay(amount);
    }

    void payWithPayPal(double amount){
        payPalPayment.sendPayment(amount);
    }

    void payWithCrypto(String walletAddress, double amount){
        cryptoPayment.makeTrans(walletAddress, amount);
    }
}
