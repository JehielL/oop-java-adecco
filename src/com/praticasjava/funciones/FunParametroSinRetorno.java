package com.praticasjava.funciones;

import java.util.UUID;

public class FunParametroSinRetorno {
    public static void main(String[] args) {

        String randomFileName1 = generateRandomName();
        System.out.println(randomFileName1);
        String randomFileName2 = generateRandomName();
        System.out.println(randomFileName2);
        String randomFileName3 = generateRandomName();
        System.out.println(randomFileName3);
    }

    private static String generateRandomName() {

    return UUID.randomUUID().toString();
    }





}
