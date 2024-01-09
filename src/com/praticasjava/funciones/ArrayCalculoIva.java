package com.praticasjava.funciones;

import java.util.Arrays;

public class ArrayCalculoIva {

    public static void main(String[] args) {

        double[] listaPrecios = {5.50, 6.60, 7.70, 8.80, 9.90, 10.10, 3.30};

        double[] precioConIva = calcularImp(listaPrecios);

        System.out.println(Arrays.toString(precioConIva));
    }

    private static double[] calcularImp(double[] listaPrecios) {

        double[] preciosConIva = new double[listaPrecios.length];

        for (int i = 0; i < preciosConIva.length; i++){

            preciosConIva[i] = listaPrecios[i] * 1.21;

        }

        return preciosConIva;
    }
}
