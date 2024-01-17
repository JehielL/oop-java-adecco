package com.praticasjava.herencia3;

public class Main {

    public static void main(String[] args) {

        MetodoDePagoTarjeta tarjeta1 = new MetodoDePagoTarjeta("Ramon",
                "TechChef",
                "465487",
                19.99,
                "123456789",
                "0000");


        MetodoDePago paypal = new MetodoDePagoPaypal("Pedro",
                "Adecco",
                "Factura-002",
                20.20,
                "pedro@prueba.com",
                "A153443");

        paypal.realizarPago();



    }
}
