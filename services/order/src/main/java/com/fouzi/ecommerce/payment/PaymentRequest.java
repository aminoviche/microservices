package com.fouzi.ecommerce.payment;

import com.fouzi.ecommerce.customer.CustomerResponse;
import com.fouzi.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
