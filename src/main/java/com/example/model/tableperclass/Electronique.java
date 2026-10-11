package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Electronique extends Produit {

    private int garantie; // durée en mois

    public Electronique() {}

    public Electronique(String nom, int garantie) {
        super(nom);
        this.garantie = garantie;
    }

    // getters et setters
}