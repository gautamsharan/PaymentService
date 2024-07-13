package com.example.paymentservice.paymentGateway;

public interface IPaymentGateway {
    String getPaymentLink(Long amount, String email, String name, String phoneNumber, String orderId);
}
