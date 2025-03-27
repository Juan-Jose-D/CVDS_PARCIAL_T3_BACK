package edu.eci.cvds.parcial.controller;

import edu.eci.cvds.parcial.model.*;
import edu.eci.cvds.parcial.service.*;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    

    @PostMapping
    public ResponseEntity<?> paymentReservation(@RequestBody Payment payment, HashMap<String, Integer> products) {
        try {
            return new ResponseEntity<>(paymentService.createPayment(payment, products), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

}
