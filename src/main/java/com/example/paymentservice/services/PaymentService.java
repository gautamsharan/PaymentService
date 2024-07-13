package com.example.paymentservice.services;

import com.example.paymentservice.paymentGateway.IPaymentGateway;
import com.example.paymentservice.paymentGateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String initiatePayment(Long amount, String email, String name, String phoneNumber, String orderId) {
        IPaymentGateway pg = paymentGatewayChooserStrategy.getPaymentGateway();
        return pg.getPaymentLink(amount, email, name, phoneNumber, orderId);
    }
}
