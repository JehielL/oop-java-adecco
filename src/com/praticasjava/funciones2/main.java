package com.praticasjava.funciones2;

public class main {

    public static void main(String[] args) {

        int resultado1 = CalculadoraBasica.sumar(10,20);

        int resultado2 = CalculadoraBasica.restar(20,30);

        double resultado3 = CalculadoraBasica.multiplicar(50.00, 60.00);

        double media = CalculadoraAvanzada.calcularMedia(new double[] {3.40,4.50, 3.60,9.50, 3.30,5.50});
    }
}
