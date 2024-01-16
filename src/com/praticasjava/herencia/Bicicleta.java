package com.praticasjava.herencia;

public class Bicicleta extends Vehiculo {

    private String materiales;
    private boolean suspensionDelantera;
    private boolean suspensionTrasera;

   // CONSTRUCTORES


    public Bicicleta(){


    }


    public Bicicleta(
            String fabricante,
            String modelo,
            int numRuedas,
            String materiales,
            boolean suspensionDelantera,
            boolean suspensionTrasera) {
        super(fabricante, modelo, numRuedas);
        this.materiales = materiales;
        this.suspensionDelantera = suspensionDelantera;
        this.suspensionTrasera = suspensionTrasera;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public boolean isSuspensionDelantera() {
        return suspensionDelantera;
    }

    public void setSuspensionDelantera(boolean suspensionDelantera) {
        this.suspensionDelantera = suspensionDelantera;
    }

    public boolean isSuspensionTrasera() {
        return suspensionTrasera;
    }

    public void setSuspensionTrasera(boolean suspensionTrasera) {
        this.suspensionTrasera = suspensionTrasera;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "materiales='" + materiales + '\'' +
                ", suspensionDelantera=" + suspensionDelantera +
                ", suspensionTrasera=" + suspensionTrasera +
                '}';
    }
}


