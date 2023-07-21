package com.example.reto1modulo2.Model;

import jakarta.persistence.*;

@Entity // Como es una entidad debemos indicarle a springboot que lo trate como una entidad
@Table(name="usuario") // Indicamos que es una tabla
public class User {
    @Id  // Cramos el id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // con esto hacemos que se genere automaticamente el id
    private Integer id;

    private String email;

    private String password;

    private String name;

    // Metodos constructores
    public User(Integer id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public User(){

    }

    // Setters and Gettters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
