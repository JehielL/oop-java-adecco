package com.praticasjava.herencia3;

public class Main2 {

    public static void main(String[] args) {

        MetodoDePagoPaypal paypalMaria = new MetodoDePagoPaypal();
        MetodoDePagoPaypal paypalJehiel = new MetodoDePagoPaypal();
        MetodoDePagoTarjeta tarjetaJose = new MetodoDePagoTarjeta();
        MetodoDePagoTarjeta tarjetaMl = new MetodoDePagoTarjeta();
        MetodoDePagoTarjeta tarjetaPieru = new MetodoDePagoTarjeta();

        MetodoDePago[] pagosGenerales = {paypalJehiel,paypalMaria, tarjetaJose, tarjetaMl, tarjetaPieru};

        for (MetodoDePago metodo: pagosGenerales){
            metodo.realizarPago();
        }



    }
}
