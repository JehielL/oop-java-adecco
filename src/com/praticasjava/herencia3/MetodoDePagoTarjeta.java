package com.praticasjava.herencia3;

public class MetodoDePagoTarjeta extends MetodoDePago {

    private String numTarjeta;
    private String codigoSeguridad;


    //CONSTRUCTOR


    public MetodoDePagoTarjeta() {

    }

    public MetodoDePagoTarjeta(String nombreEmisor, String nombreReceptor,
                               String numFactura, double cantidad,
                               String numTarjeta, String codigoSeguridad) {
        super(nombreEmisor, nombreReceptor, numFactura, cantidad);
        this.numTarjeta = numTarjeta;
        this.codigoSeguridad = codigoSeguridad;
    }

    //METODOS OVERRIDE

    @Override
    public boolean realizarPago() {
      // return super.realizarPago();
        System.out.println("Pagando con tarjeta...Override");
        return true;
    }


    //GETTER Y SETTER

    public String getNumTarjeta(){
        return numTarjeta;
    }

    //toString




}
