package com.Ekwateur.test.service;

import com.Ekwateur.test.model.ClientPro;
import com.Ekwateur.test.utils.FacturationConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturationClientProServiceImpl implements FacturationClientProService {

    @Autowired
    private FacturationConstant facturationConstant;


    @Override
    public double calculerMontantFacture(ClientPro client, double consommationElectrique, double consommationGaz) {

        double montantElectrique = client.getChiffreAffaires() > facturationConstant.getSeuilCaPro() ?
                consommationElectrique * facturationConstant.getTarifElectriciteProCaSuperieur():
                consommationElectrique * facturationConstant.getTarifElectriciteProCaInferieur() ;

        double montantGaz = client.getChiffreAffaires() > facturationConstant.getSeuilCaPro() ?
                consommationGaz * facturationConstant.getTarifGazProCaSuperieur() :
                consommationGaz * facturationConstant.getTarifGazProCaInferieur() ;

        return montantElectrique + montantGaz;
    }
}
