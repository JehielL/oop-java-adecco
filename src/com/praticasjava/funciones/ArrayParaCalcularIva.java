package com.praticasjava.funciones;

import java.util.Arrays;

public class ArrayParaCalcularIva {

    public static void main(String[] args) {

        double[] listPrices = {3.33, 2.22, 1.11, 4.55, 6.44,7.77};
        double[] priceIva = calculateIva(listPrices);

        System.out.println(Arrays.toString(priceIva));
    }

    private static double[] calculateIva(double[] listPrices) {

        double[] priceIva = new double[listPrices.length];

        for (int i = 0 ; i < listPrices.length; i++){

            priceIva[i] = listPrices[i] * 1.21;
        }

        return priceIva;

    }
}
