package com.praticasjava.excepciones2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws incorrectNameLengthException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce tu un nombre con mas de 2 letras");

        String nombre = scanner.nextLine();

        System.out.println("Tu nombre es: " + nombre);

        if (nombre.length() <= 2)
            throw new incorrectNameLengthException("Longitud de nombre minima incorrecta");


    }
}
