package com.Ekwateur.test.service;

import com.Ekwateur.test.model.ClientParticulier;

public interface FacturationClientParticulierService {
    public double calculerMontantFacture(ClientParticulier client, double consommationElectrique, double consommationGaz);
}
