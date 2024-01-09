package com.praticasjava.funciones;

public class calcularPromedio {

    public static void main(String[] args) {

        double[] notasGenerales = {3.22, 4.95, 6.33, 4.66, 10.00, 7.50};
        double promedio = calculoPromedio(notasGenerales);
        System.out.println("Tu nota promedio es: " + promedio);

    }
    private static double calculoPromedio(double[] notasGenerales) {
        double i = 0;

        for (double nota : notasGenerales) {

            i += nota;
        }

            return  i / notasGenerales.length;
    }
}
