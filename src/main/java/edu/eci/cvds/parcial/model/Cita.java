package edu.eci.cvds.parcial.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Cita")

public class Cita {
    @Id
    private String id;

    @Field("Especialidad")
    private Especialidad especialidad;

    @Field("Usuario")
    private Usuario usuario;

    @Field("Fecha")
    private Date date;
    
    public Cita(Especialidad especialidad, Usuario usuario, Date date){
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
