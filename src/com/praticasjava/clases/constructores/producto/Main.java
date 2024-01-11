package com.praticasjava.clases.constructores.producto;

public class Main {

    public static void main(String[] args) {

        Producto prod1 = new Producto();
        prod1.title = "Iphone 15";
        prod1.price = 29.99;
        prod1.quantity = 2;
        prod1.id = 1L;
        System.out.println(prod1);



        Producto prod2 = new Producto(2L,"TV",500.0,3);
        System.out.println(prod2);
        Producto prod3 = new Producto("Disco Duro");
        System.out.println(prod3);

    }
}

