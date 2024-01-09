package com.praticasjava.funciones;

import java.util.Arrays;

public class FuncionesParametrosConRetorno {

    public static void main(String[] args) {

        double[] preciosSinIva = {2.50, 3.50, 4.50, 5.50, 6.50, 7.50, 8.50, 9.50};
        double[] preciosConIva = calcularImpuesto(preciosSinIva);

        System.out.println(Arrays.toString(preciosConIva));
    }

    private static double[] calcularImpuesto(double[] preciosSinIva) {

       double[] preciosConIva = new double[preciosSinIva.length];

       for(int i = 0; i < preciosConIva.length; i++ ){

           preciosConIva[i] = preciosSinIva[i] * 1.21;
        }
        return preciosConIva;

    }

}
