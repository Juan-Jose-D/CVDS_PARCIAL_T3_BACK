package edu.eci.cvds.parcial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.eci.cvds.parcial.model.*;
import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Optional<Usuario> findById(String id);

    Optional<Usuario> findByName(String name);
}
