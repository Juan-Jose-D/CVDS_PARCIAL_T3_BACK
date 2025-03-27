package edu.eci.cvds.parcial.controller;

import edu.eci.cvds.parcial.model.*;
import edu.eci.cvds.parcial.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<?> productReservation(@RequestBody Product product) {
        try {
            return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        try {
            return productService.getProductById(id);
        } catch (RuntimeException e) {
            throw new RuntimeException("Product not found");
        }
    }

            
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        try {
            productService.deleteProduct(id);
        } catch (RuntimeException e) {
            throw new RuntimeException("Product not found");
        }
    }
}