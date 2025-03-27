package edu.eci.cvds.parcial.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.cvds.parcial.repository.*;
import edu.eci.cvds.parcial.model.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final ProductRepository productRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository, ProductRepository productRepository) {
        this.paymentRepository = paymentRepository;
        this.productRepository = productRepository;
    }

    public Payment createPayment(Payment payment, HashMap<String, Integer> products) {
        int totalPrice = 0;
        for (String key : products.keySet()) {
            Product product = productRepository.findById(key).orElseThrow(() -> new RuntimeException("Product not found"));
            totalPrice += product.getPrice();
        }
        payment.setId(new ObjectId().toString());
        payment.setDate(new Date());
        payment.setTotalPrice(totalPrice);
        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
