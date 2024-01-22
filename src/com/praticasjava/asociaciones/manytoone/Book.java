package com.praticasjava.asociaciones.manytoone;

public class Book extends BaseEntity {

    private String title;
    private double price;
    private int numPages;
    private Author author;
    private Editorial editorial;
}
