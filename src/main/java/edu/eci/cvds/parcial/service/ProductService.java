package edu.eci.cvds.parcial.service;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.cvds.parcial.repository.*;
import edu.eci.cvds.parcial.model.*;

@Service
public class ProductService {
    
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        if(productRepository.findByName(product.getName()).isPresent()) {
            throw new RuntimeException("Product already exists");
        }
        product.setId(new ObjectId().toString());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}