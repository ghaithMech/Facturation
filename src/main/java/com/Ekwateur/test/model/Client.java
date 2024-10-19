package com.Ekwateur.test.model;

import com.Ekwateur.test.utils.GestionException;
import lombok.Getter;

@Getter
public abstract class Client {

    private String referenceClient;

    public Client(String referenceClient){
        GestionException.validerReferenceClient(referenceClient);
        this.referenceClient = referenceClient;
    }

    public void setReferenceClient(String referenceClient) {
        GestionException.validerReferenceClient(referenceClient);
        this.referenceClient = referenceClient;
    }
}
