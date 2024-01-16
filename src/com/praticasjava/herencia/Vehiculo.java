package com.praticasjava.herencia;

public class Vehiculo {
    private String fabricante;
    private String modelo;
    private int numRuedas;

    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modelo, int numRuedas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numRuedas=" + numRuedas +
                '}';
    }
}
