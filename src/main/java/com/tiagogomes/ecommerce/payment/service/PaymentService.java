package com.tiagogomes.ecommerce.payment.service;

import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.tiagogomes.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
