package com.praticasjava.funciones;

public class CalPromedio {

    public static void main(String[] args) {

        double[] notasGenerales = {2.22, 10.00, 9.50, 6.66, 3.35, 3.35, 5.99};
        double promedio = calcularProm(notasGenerales);
        System.out.printf("Tu promedio es: %.2f\n", + promedio);

        long notaFinal = Math.round(promedio);
        System.out.println("Tu nota final es: " + notaFinal);


    }

    private static double calcularProm(double[] notasGenerales) {

        double i = 0 ;
        for (double nota : notasGenerales){

            i += nota;
        }

        return i / notasGenerales.length;
    }
}
