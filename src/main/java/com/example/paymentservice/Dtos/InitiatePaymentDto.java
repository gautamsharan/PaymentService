package com.example.paymentservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDto {
    private Long amount;
    private String email;
    private String name;
    private String phoneNumber;
    private String orderId;
}
