package com.praticasjava.excepciones2;

import java.io.FileReader;
import java.io.IOException;

class ExcepcionPersonalizada extends Exception {
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}

public class FuncionesConExcepciones {

    public static double dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }

    public static void leerArchivo(String nombreArchivo) {
        try (FileReader archivo = new FileReader(nombreArchivo)) {
            System.out.println("Archivo abierto exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo: " + e.getMessage());
        }
    }

    public static void mostrarLongitud(String cadena) {
        if (cadena == null) {
            throw new NullPointerException("El argumento no puede ser nulo");
        }
        System.out.println("Longitud de la cadena: " + cadena.length());
    }

    public static void lanzarExcepcionPersonalizada(boolean condicion) throws ExcepcionPersonalizada {
        if (condicion) {
            throw new ExcepcionPersonalizada("Se cumple la condición para la excepción personalizada");
        }
    }

    public static void main(String[] args) {
        try {
            double resultadoDivision = dividir(10, 2);
            System.out.println("Resultado de la división: " + resultadoDivision);

            leerArchivo("archivo.txt");

            mostrarLongitud("Hola, mundo!");



        } catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Error de puntero nulo: " + e.getMessage());
        }
    }
}
