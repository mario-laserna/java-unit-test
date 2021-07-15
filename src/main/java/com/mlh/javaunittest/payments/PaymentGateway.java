package com.mlh.javaunittest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
