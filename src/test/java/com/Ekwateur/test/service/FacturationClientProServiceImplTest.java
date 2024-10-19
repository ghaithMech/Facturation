package com.Ekwateur.test.service;

import com.Ekwateur.test.model.ClientPro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacturationClientProServiceImplTest {

    @Autowired
    private FacturationClientProService facturationClientProService;


    @Test
    public void testCalculerMontantFactureClientProChiffreAffaireSuperieurSeuil() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345671234567", "Entreprise", 2000000);
        double montant = facturationClientProService.calculerMontantFacture(clientPro,1000,1000);
        assertEquals(225,montant);
    }

    @Test
    public void testCalculerMontantFactureClientProChiffreAffaireInferieurSeuil() {
        ClientPro clientPro = new ClientPro("EKW12345678", "12345671234567", "Entreprise", 500000);
        double montant = facturationClientProService.calculerMontantFacture(clientPro,1000,1000);
        assertEquals(231,montant);
    }
}