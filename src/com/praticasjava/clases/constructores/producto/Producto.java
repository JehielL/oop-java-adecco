package com.praticasjava.clases.constructores.producto;

public class Producto {

    long id;
    String title;
    double price;
    int quantity;

    public Producto() {
    }

    public Producto(long id, String title, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public Producto(String title) {
        this.title = title;

    }
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


}
