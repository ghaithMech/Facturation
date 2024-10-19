package com.Ekwateur.test.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientPro extends Client {

    private String numeroSIRET;
    private String raisonSociale;
    private double chiffreAffaires;


    public ClientPro(String referenceClient, String numeroSIRET, String raisonSociale, double chiffreAffaires) {
        super(referenceClient);
        this.numeroSIRET = numeroSIRET;
        this.raisonSociale = raisonSociale;
        this.chiffreAffaires = chiffreAffaires;
    }
}
