package com.example.model.joined;

import javax.persistence.Entity;

@Entity
public class Developpeur extends Employe {

    private String langage;

    public Developpeur() {}

    public Developpeur(String nom, String langage) {
        super(nom);
        this.langage = langage;
    }

    // getters et setters
}