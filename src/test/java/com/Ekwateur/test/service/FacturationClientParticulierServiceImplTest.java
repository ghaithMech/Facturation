package com.Ekwateur.test.service;

import com.Ekwateur.test.model.ClientParticulier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacturationClientParticulierServiceImplTest {

    @Autowired
    private FacturationClientParticulierService facturationClientParticulierService;

    @Test
    public void testCalculerMontantFactureClientParticulier() {
        ClientParticulier clientParticulier = new ClientParticulier("EKW12345678", "Mr", "MECHMECH", "Ghaith");
        double montant = facturationClientParticulierService.calculerMontantFacture(clientParticulier,1000,1000);
        assertEquals(236,montant);
    }
}