package com.example.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MOTO")
public class Moto extends Vehicule {

    private boolean sidecar;

    public Moto() {}

    public Moto(String marque, boolean sidecar) {
        super(marque);
        this.sidecar = sidecar;
    }

    // getters et setters
}