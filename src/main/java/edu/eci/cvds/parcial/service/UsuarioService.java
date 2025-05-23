package edu.eci.cvds.parcial.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.cvds.parcial.repository.*;
import edu.eci.cvds.parcial.model.*;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario createUsuario(Usuario usuario) {
        usuario.setId(new ObjectId().toString());
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(String id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario not found"));
    }

    public void deleteUsuario(String id) {
        usuarioRepository.deleteById(id);
    }
}
