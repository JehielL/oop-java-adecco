package com.praticasjava.funciones3;

public class FuncionesCuatro {
    public static void main(String[] args) {

        int resultado1 = Calculadora.sumar(5,10);

        System.out.println(resultado1);

        Calculadora calculadoraCasio = new Calculadora();

        int resultado2 = calculadoraCasio.multiplicar(10,5);

        System.out.println(resultado2);

    }
}
