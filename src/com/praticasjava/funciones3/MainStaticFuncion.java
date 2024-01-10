package com.praticasjava.funciones3;

import java.util.List;
import java.util.UUID;

public class MainStaticFuncion {

    public static void main(String[] args) {
        String numeroPrueba = String.valueOf(500.60);
        System.out.println(numeroPrueba);
        int valorMin = Math.min(5,10);
        System.out.println(valorMin);
        UUID identificador = UUID.randomUUID();
        System.out.println(identificador);
        double valorMax = Double.max(40.4, 30.50);
        System.out.println(valorMax);
        long tiempoActualMs = System.currentTimeMillis();
        System.out.println(tiempoActualMs);
        boolean isDigit = Character.isDigit('A');
        System.out.println(isDigit);
        boolean isLeter = Character.isDigit(2);
        System.out.println(isLeter);
        List<String> personas = List.of("Persona1", "Persona2");
        System.out.println(personas);
    }
}
