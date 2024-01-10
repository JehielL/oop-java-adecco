package com.praticasjava.funciones3;

public class MetodoString {

    public static void main(String[] args) {

        String fullName = "Ambrosio Developer Certidevs";

        String[] obtainFirstName = fullName.split(" ");

        String firstName = obtainFirstName[0];

        System.out.println("Primer nombre encontrado, es: " + firstName);

        int beginIndex = 0;
        int endIndex = fullName.indexOf(" ") ;

        String firstName2 = fullName.substring(beginIndex,endIndex);
        System.out.println("Primer nombre encontrado con Index: " + firstName2);

    }
}
