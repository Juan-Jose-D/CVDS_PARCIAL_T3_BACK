package edu.eci.cvds.parcial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.eci.cvds.parcial.model.*;
import java.util.Optional;

public interface PaymentRepository extends MongoRepository<Payment, String>{

    Optional<Payment> findById(String id);
}
