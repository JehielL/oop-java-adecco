package com.praticasjava.encapsulacion;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String modelo;
    private int velocidad;
    private double peso;

    private List<String> modelosDisponibles = List.of(
            "BMW",
            "Mercedez",
            "Audi",
            "Maseratti",
            "Ford"
    );

    public Vehiculo() {
    }

    public Vehiculo(String modelo, int velocidad, double peso) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.peso = peso;
    }

    //metodos getter y setter

    public String getModelo() {
        return modelo;
    }

//    public void setModelo(String modelo) {
//        if(modelosDisponibles.contains(modelo))
//            this.modelo = modelo;
//        else
//            System.out.println("Modelo no disponible");
//    }

    public void setModelo(String modelo){

        if (!checkEngine())
            return; // Si el motor no está correcto hacer return para salir.

        for(String modeloDisponible:modelosDisponibles)
            if(modelo.contains(modeloDisponible)){
                this.modelo = modelo;
                break;
            }
    }
    /*
    Creamos metodos privados que forman parte de un comportamiento o proceso mas grande.
     */
    private boolean checkEngine(){
        return true;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {

        if(velocidad >= 0 && velocidad <= 150)
            this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    //metedo toString


    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", peso=" + peso +
                '}';
    }
}
