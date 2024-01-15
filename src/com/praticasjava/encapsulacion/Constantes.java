package com.praticasjava.encapsulacion;

public class Constantes {

    public static final double PRECIO_DIESEL = 1.33;

    public static final double IVA = 1.21;
    private static String MENSAJE = "Calculando precio";

    public static double calcularCombustible(){
        System.out.println(MENSAJE);

        return PRECIO_DIESEL * IVA;
    }

    private Constantes(){


    }

}
