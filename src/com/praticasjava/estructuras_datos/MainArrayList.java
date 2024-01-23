package com.praticasjava.estructuras_datos;

import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList<String> frases = new ArrayList<>();

        frases.add("Hola");
        frases.add("Jehiel");
        frases.add("Esto");
        frases.add("es");
        frases.add("Un Array");

        System.out.println(frases);

        ArrayList<Double> precios = new ArrayList<>();
        precios.add(3.70);
        precios.add(4.70);
        precios.add(5.70);
        precios.add(6.70);
        precios.add(7.70);

        System.out.println(precios.getLast());


        ArrayList<Producto> productos = new ArrayList<>();
        Producto televisor = new Producto("Televisor", 520.20);
        Producto cellphone = new Producto("Celular", 120.20);
        productos.add(televisor);
        productos.add(cellphone);

        System.out.println(productos);
    }




}
