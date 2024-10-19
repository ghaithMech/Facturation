package com.Ekwateur.test.utils;

public class GestionException {

    public static final String REGEX_REFERENCE_CLIENT = "^EKW\\d{8}$";

    public static void validerReferenceClient(String referenceClient) {
        if (!referenceClient.matches(REGEX_REFERENCE_CLIENT)) {
            throw new InvalidReferenceClientException("Référence client invalide : " + referenceClient + ". Le format doit être 'EKW' suivi de 8 chiffres.");
        }
    }
}
