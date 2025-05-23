package edu.eci.cvds.parcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Especialidad")

public class Especialidad {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("description")
    private String description;  

    @Field("Doctor")
    private Doctor doctor;

    @Field("Ubication")
    private String ubication;

    public Especialidad(String name, String description, Doctor doctor, String ubication){
        this.name = name;
        this.description = description;
        this.doctor = doctor;
        this.ubication = ubication;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getUbication() {
        return ubication;
    }

    
}