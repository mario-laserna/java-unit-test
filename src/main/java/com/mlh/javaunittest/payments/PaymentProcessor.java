package com.mlh.javaunittest.payments;

public class PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse paymentResponse = gateway.requestPayment(new PaymentRequest(amount));

        if(paymentResponse.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        }

        return false;
    }
}
