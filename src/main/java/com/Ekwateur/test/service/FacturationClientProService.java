package com.Ekwateur.test.service;

import com.Ekwateur.test.model.ClientPro;

public interface FacturationClientProService {
    public double calculerMontantFacture(ClientPro client, double consommationElectrique, double consommationGaz);
}
