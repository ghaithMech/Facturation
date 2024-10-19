package com.Ekwateur.test;


import com.Ekwateur.test.model.ClientParticulier;
import com.Ekwateur.test.model.ClientPro;
import com.Ekwateur.test.service.FacturationClientParticulierService;
import com.Ekwateur.test.service.FacturationClientParticulierServiceImpl;
import com.Ekwateur.test.service.FacturationClientProService;
import com.Ekwateur.test.service.FacturationClientProServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FacturationApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FacturationApplication.class, args);

		FacturationClientParticulierService facturationClientParticulierService = context.getBean(FacturationClientParticulierServiceImpl.class);
		FacturationClientProService facturationClientProService = context.getBean(FacturationClientProServiceImpl.class);

		ClientParticulier clientParticulier = new ClientParticulier("EKW12345678", "Mr", "MECHMECH", "Ghaith");


		double factureClientParticulier = facturationClientParticulierService.calculerMontantFacture(clientParticulier, 200, 100);
		System.out.println("Facture pour le client particulier : " + factureClientParticulier);


		ClientPro clientProSuperieurSeuil = new ClientPro("EKW12341234", "12345671234567", "Entreprise A", 2000000);


		double factureClientProSuperieurSeuil = facturationClientProService.calculerMontantFacture(clientProSuperieurSeuil, 200, 100);
		System.out.println("Facture pour le client professionnel avec Chiffre d'affaire supérieur à 1M : " + factureClientProSuperieurSeuil);

		ClientPro clientProInferieurSeuil = new ClientPro("EKW11223344", "11223344556677", "Entreprise B", 500000);


		double factureClientProInferieurSeuil = facturationClientProService.calculerMontantFacture(clientProInferieurSeuil, 200, 100);
		System.out.println("Facture pour le client professionnel avec Chiffre d'affaire inférieur à 1M : " + factureClientProInferieurSeuil);

	}

}
