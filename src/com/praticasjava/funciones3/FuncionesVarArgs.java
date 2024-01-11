package com.praticasjava.funciones3;

public class FuncionesVarArgs {

    public static void main(String[] args) {

        System.out.println(sumatorio(10,20));
        System.out.println(sumatorio(10,20,10,20,50));
        System.out.println(sumatorio(10,20));
        System.out.println(sumatorio(10,20));
    }

    private static int sumatorio(int... numeros) {
        int suma = 0;

        for (int numero: numeros){

            suma+= numero;
        }
        return suma;
    }

}
