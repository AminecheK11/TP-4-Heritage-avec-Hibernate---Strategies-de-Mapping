package com.example.model.joined;

import javax.persistence.Entity;

@Entity
public class Manager extends Employe {

    private int nombreEquipes;

    public Manager() {}

    public Manager(String nom, int nombreEquipes) {
        super(nom);
        this.nombreEquipes = nombreEquipes;
    }

    // getters et setters
}