package com.Ekwateur.test.utils;

import com.Ekwateur.test.model.ClientPro;
import org.junit.Test;


public class GestionExceptionTest {

    @Test(expected = InvalidReferenceClientException.class)
    public void testExceptionReferenceClientInvalideTaille() {
        ClientPro clientPro = new ClientPro("EKW1234","12345671234567","Entreprise",10000);
    }

    @Test(expected = InvalidReferenceClientException.class)
    public void testExceptionReferenceClientSansEKW() {
        ClientPro clientPro = new ClientPro("EK12345678","12345671234567","Entreprise",10000);
    }

    @Test(expected = InvalidReferenceClientException.class)
    public void testExceptionChangeInvalidReferenceClient() {
        ClientPro clientPro = new ClientPro("EKW12345678","12345671234567","Entreprise",10000);
        clientPro.setReferenceClient("EKW1234");
    }



}