package com.praticasjava.excepciones;

public class Main {


    public static void main(String[] args) {

        int resultado = 0;
        try {
            resultado = 5/0;
        } catch (Exception e) {
            System.out.println("Division incorrecta, no se puede divir por 0");
        }
        System.out.println("continua el programa");

    }
}
