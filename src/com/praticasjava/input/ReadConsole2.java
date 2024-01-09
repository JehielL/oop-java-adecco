package com.praticasjava.input;

import java.util.Scanner;

public class ReadConsole2 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int edad = readInt("Introduce tu edad ");
        System.out.println(edad);
    }

    private static int readInt(String prompt) {
        System.out.println(prompt);
        int numero = scanner.nextInt();
        return numero;
    }


}
