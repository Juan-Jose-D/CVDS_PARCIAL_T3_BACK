package edu.eci.cvds.parcial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.eci.cvds.parcial.model.*;
import java.util.Optional;

public interface CitaRepository extends MongoRepository<Cita, String>{
    Optional<Cita> findById(String id);

    
}
