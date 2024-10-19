package com.Ekwateur.test.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientParticulier extends Client {
    private String civilite;
    private String nom;
    private String prenom;

    public ClientParticulier(String referenceClient, String civilite, String nom, String prenom) {
        super(referenceClient);
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
    }
}
