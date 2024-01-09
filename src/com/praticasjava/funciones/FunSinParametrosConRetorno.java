package com.praticasjava.funciones;

public class FunSinParametrosConRetorno {

    public static void main(String[] args) {

        String nombre = "Jehiel";
        String apellido = "Linarez";

        saludarPorNombre(nombre);
        saludarPorApellido(apellido);
        saludar(nombre, apellido);
    }

    private static void saludar(String nombre, String apellido) {

        System.out.println("Hola " + nombre + " " + apellido );
    }

    private static void saludarPorNombre(String nombre) {

        System.out.println("Hola " + nombre);
    }

    private  static void saludarPorApellido(String apellido){

        System.out.println("Hola Sr. " + apellido);
    }

}
