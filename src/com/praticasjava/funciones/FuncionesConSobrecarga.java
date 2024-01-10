package com.praticasjava.funciones;

public class FuncionesConSobrecarga {

    public static void main(String[] args) {

        int numero1 = 2;
        int numero2 = 2;

        int resultado = suma(numero1,numero2);

        double numero3 = 10.33;
        double numero4 = 50.50;
        double resultado2 = suma(numero3, numero4);

        double resultado3 = suma(10,20, true);

    }



    private static double suma(int num1, int num2, boolean b) {
        return num1 + num2;
    }

    private static double suma(double num1, double num2){
        return num1 + num2;
    }

    private static int suma(int numero1, int numero2) {

        return numero1 + numero2;
    }
}
