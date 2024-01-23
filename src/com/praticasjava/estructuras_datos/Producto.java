package com.praticasjava.estructuras_datos;

public class Producto {

    //atributos


    private String title;
    private Double price;


    //constructor

    public Producto(){


    }

    public Producto(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    //getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //toString


    @Override
    public String toString() {
        return "Producto: " +
                "Tipo= '" + title + '\'' +
                ", Precio= " + price ;
    }
}
