package com.Ekwateur.test.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class FacturationConstant {

    @Value("${tarif.electricite.particulier}")
    private double tarifElectriciteParticulier;

    @Value("${tarif.gaz.particulier}")
    private double tarifGazParticulier;

    @Value("${tarif.electricite.pro.ca.inferieur}")
    private double tarifElectriciteProCaInferieur;

    @Value("${tarif.gaz.pro.ca.inferieur}")
    private double tarifGazProCaInferieur;

    @Value("${tarif.electricite.pro.ca.superieur}")
    private double tarifElectriciteProCaSuperieur;

    @Value("${tarif.gaz.pro.ca.superieur}")
    private double tarifGazProCaSuperieur;

    @Value("${seuil.ca.pro}")
    private double seuilCaPro;

}
