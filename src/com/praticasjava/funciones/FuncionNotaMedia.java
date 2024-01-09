package com.praticasjava.funciones;

public class FuncionNotaMedia {

    public static void main(String[] args) {

        double[] notasGenerales = {2.22, 6.66, 5.55, 9.55, 9.55};
        double promedio = calcularPromedio(notasGenerales);
        System.out.println("El promedio de las notas es: " + promedio);
    }

    private static double calcularPromedio(double[] notasGenerales) {
        double suma = 0;

        for (double nota : notasGenerales) {
            suma += nota;
        }

        return suma / notasGenerales.length;
    }
}
