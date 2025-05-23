package edu.eci.cvds.parcial.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.cvds.parcial.repository.*;
import edu.eci.cvds.parcial.model.*;

@Service
public class CitaService {
    private final CitaRepository citaRepository;

    @Autowired
    public CitaService(CitaRepository citaRepository){
        this.citaRepository = citaRepository;
    }

    public Cita createCita(Cita cita) {
        cita.setId(new ObjectId().toString());
        return citaRepository.save(cita);
    }

    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    public Cita getCitaById(String id) {
        return citaRepository.findById(id).orElseThrow(() -> new RuntimeException("Cita not found"));
    }

    public void deleteCita(String id) {
        citaRepository.deleteById(id);
    }

}
