package com.praticasjava.excepciones;

import java.io.IOException;

public class Main5 {

    public static void main(String[] args) {

        try {
            realizarAccion();
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo");
        }


    }

    public static void realizarAccion() throws IOException {

        throw new IOException();



    }
}
