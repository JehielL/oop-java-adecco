package com.praticasjava.dates;

import java.time.LocalDateTime;

public class MainLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime fechaHoy = LocalDateTime.now();
        System.out.println(fechaHoy);

        LocalDateTime fechaEvent = LocalDateTime.of(2024,5,10,10,30);
        System.out.println(fechaEvent);


    }
}
