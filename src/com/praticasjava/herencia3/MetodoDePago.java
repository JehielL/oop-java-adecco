package com.praticasjava.herencia3;

public class MetodoDePago {

    //ATRIBUTOS

    private String nombreEmisor;
    protected String nombreReceptor;
    private String numFactura;
    private double cantidad;

    //CONSTRUCTOR

    public MetodoDePago(){

    }

    public MetodoDePago(String nombreEmisor, String nombreReceptor, String numFactura, double cantidad) {
        this.nombreEmisor = nombreEmisor;
        this.nombreReceptor = nombreReceptor;
        this.numFactura = numFactura;
        this.cantidad = cantidad;
    }

    //METODOS PROPIOS

    public boolean realizarPago(){
        System.out.println("Realizando pago por defecto(Contra reembolso)");
        return true;
    }

    //GETTER AND SETTER

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    //TO STRING


    @Override
    public String toString() {
        return "MetodoDePago{" +
                "nombreEmisor='" + nombreEmisor + '\'' +
                ", nombreReceptor='" + nombreReceptor + '\'' +
                ", numFactura='" + numFactura + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
