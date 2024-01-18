package com.praticasjava.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad = 0;

        do {
            System.out.println("Introduce tu edad en numeros: ");
            try {
                edad = scanner.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Formato Incorrecto");
            }
            scanner.nextLine();

        } while (true);

        System.out.println("Tu edad es: " + edad);

    }
}
