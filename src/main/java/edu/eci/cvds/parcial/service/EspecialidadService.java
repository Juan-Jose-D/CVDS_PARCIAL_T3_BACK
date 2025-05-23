package edu.eci.cvds.parcial.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.cvds.parcial.repository.*;
import edu.eci.cvds.parcial.model.*;

@Service
public class EspecialidadService {
    private EspecialidadRepository especialidadRepository;

    @Autowired
    public EspecialidadService(EspecialidadRepository especialidadRepository){
        this.especialidadRepository = especialidadRepository;
    }

    public Especialidad createEspecialidad(Especialidad especialidad) {
        especialidad.setId(new ObjectId().toString());
        return especialidadRepository.save(especialidad);
    }

    public List<Especialidad> getAllEspecialidades() {
        return especialidadRepository.findAll();
    }

    public Especialidad getEspecialidadById(String id) {
        return especialidadRepository.findById(id).orElseThrow(() -> new RuntimeException("Especialidad not found"));
    }

    public void deleteEspecialidad(String id) {
        especialidadRepository.deleteById(id);
    }
}
