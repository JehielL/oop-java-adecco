package com.praticasjava.excepciones;

public class Main2 {

    public static void main(String[] args) {

        try{
            String nombre = null;
            nombre.split(" ");
            int resultado = 5/0;
        } catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e){

            e.printStackTrace();
        }
        System.out.println("Continuamos");
    }

}
