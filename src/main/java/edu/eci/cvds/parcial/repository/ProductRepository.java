package edu.eci.cvds.parcial.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import edu.eci.cvds.parcial.model.*;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String>{

    Optional<Product> findById(String id);

    Optional<Product> findByName(String name);

}
