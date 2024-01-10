package com.praticasjava.funciones3;

public class FuncionesNoStatic {

    public static void main(String[] args) {

        String prueba1 = new String("h");
        String prueba2 = new String("Esto es un String de prueba");
        String prueba3 = new String();

        String lengthString = String.valueOf(prueba1.length());
        System.out.println(lengthString);
        System.out.println(prueba2);
        int longitud = prueba3.length();
        System.out.println(longitud);
        boolean esVacio = prueba3.isEmpty();
        System.out.println(esVacio);
        String textoMinuscula = prueba2.toLowerCase();
        System.out.println(textoMinuscula   );
        String resultadoReemplazado = prueba2.replace("Esto", "Aquello");
        System.out.println(resultadoReemplazado);

    }
}
