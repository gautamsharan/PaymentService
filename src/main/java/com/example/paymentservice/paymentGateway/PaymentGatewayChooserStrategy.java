package com.example.paymentservice.paymentGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public IPaymentGateway getPaymentGateway() {
        return stripePaymentGateway;
//        if (Math.random() % 2 == 0) {
//            return razorpayPaymentGateway;
//        }
//        else {
//            return stripePaymentGateway;
//        }
    }
}
