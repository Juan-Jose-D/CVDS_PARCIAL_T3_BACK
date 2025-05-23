package edu.eci.cvds.parcial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.eci.cvds.parcial.model.*;
import java.util.Optional;

public interface EspecialidadRepository extends MongoRepository<Especialidad, String>{
    Optional<Especialidad> findById(String id);

    Optional<Especialidad> findByName(String name);

    Optional<Especialidad> findByUbication(String ubication);
}
