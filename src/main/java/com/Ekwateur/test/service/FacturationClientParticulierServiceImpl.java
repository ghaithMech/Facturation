package com.Ekwateur.test.service;

import com.Ekwateur.test.model.ClientParticulier;
import com.Ekwateur.test.utils.FacturationConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturationClientParticulierServiceImpl implements FacturationClientParticulierService{

    @Autowired
    private FacturationConstant facturationConstant;

    @Override
    public double calculerMontantFacture(ClientParticulier client, double consommationElectrique, double consommationGaz) {

        double montantElectrique = consommationElectrique * facturationConstant.getTarifElectriciteParticulier();

        double montantGaz = consommationGaz * facturationConstant.getTarifGazParticulier();

        return montantElectrique + montantGaz;
    }
}
