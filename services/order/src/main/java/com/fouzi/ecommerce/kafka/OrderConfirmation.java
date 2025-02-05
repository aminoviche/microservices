package com.fouzi.ecommerce.kafka;

import com.fouzi.ecommerce.customer.CustomerResponse;
import com.fouzi.ecommerce.order.PaymentMethod;
import com.fouzi.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
