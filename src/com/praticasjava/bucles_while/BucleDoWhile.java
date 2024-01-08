package com.praticasjava.bucles_while;

import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {
    // EJEMPLO 1 DE BUCLE WHILE
        int i = 0;
        while (i  < 10) {
            System.out.println(i);
            i ++;

        }

        String password = "admin";
        Scanner scanner = new Scanner(System.in);
        String userPassword;

    // EJEMPLO 2 BUCLE WHILE
        do {
            System.out.println("Introduce Tu Password");
            userPassword = scanner.nextLine();

        } while (misMatchPassword(userPassword, password));
    }

    private static boolean misMatchPassword(String userPassword, String password) {
        return !userPassword.equals(password);
    }
}
