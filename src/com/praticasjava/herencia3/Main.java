package com.praticasjava.herencia3;

public class Main {

    public static void main(String[] args) {

        MetodoDePagoTarjeta tarjeta1 = new MetodoDePagoTarjeta("Ramon",
                "TechChef",
                "465487",
                19.99,
                "123456789",
                "0000");


        System.out.println(tarjeta1.nombreReceptor);

        tarjeta1.realizarPago();

        tarjeta1.realizarPago();



    }
}
