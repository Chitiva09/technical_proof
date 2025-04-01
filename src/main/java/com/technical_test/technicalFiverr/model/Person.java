package com.technical_test.technicalFiverr.model;

import jakarta.persistence.Entity;

@Entity//Se usa para marcar una clase como una entidad que representa una tabla en la base de datos. 


public class Person {


private String name;
private String lastName;
private String secondLastName;
private int phone;
private String email;


    public Person() {//utilizo un constructor vacio para que el freamework pueda crear instancias de esta entidad de forma automatica
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return this.secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
