package com.praticasjava.funciones;

import java.util.Scanner;



public class CalculoIva {

    public static final double IVA_TIPO_GENERAL = 0.21;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio: ");

        double precioSinIva = scanner.nextDouble() ;
        double precioConIva = calcularIva(precioSinIva);
        System.out.println("Precio Bruto: " + precioSinIva + " Precio con IVA: "+ precioConIva);


        System.out.println(precioConIva);
    }

    private static double calcularIva(double precioSinIva) {

        double iva = precioSinIva * IVA_TIPO_GENERAL;
        return precioSinIva + iva;
    }
}


