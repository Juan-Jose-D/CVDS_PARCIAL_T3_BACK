package edu.eci.cvds.parcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "User")

public class Usuario {
    @Id
    private String id;

    @Field("name")
    private String name;
    
    @Field("Cedula")
    private int cedula;

    @Field("email")
    private String email;

    public Usuario(String name, int cedula, String email){
        this.name = name;
        this.cedula = cedula;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
