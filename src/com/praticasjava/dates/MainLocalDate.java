package com.praticasjava.dates;

import java.time.LocalDate;

public class MainLocalDate {

    public static void main(String[] args) {
        int diaDelAño = 256;
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaInicio = LocalDate.of(2024, 3,24);
        LocalDate fechaFin = LocalDate.of(2024,5,15);
        LocalDate fechaDev = LocalDate.ofYearDay(LocalDate.now().getYear(), diaDelAño);

        System.out.println("Hoy es: " + fechaHoy);
        System.out.println("Tu proyecto debes comezarlo el : " + fechaInicio);
        System.out.println("Tu proyecto debe estar culminado el: " + fechaFin);
        System.out.println(fechaDev);

        boolean isBefore = fechaInicio.isBefore(fechaFin);
        boolean isAfter = fechaFin.isAfter(fechaInicio);

        System.out.println(fechaInicio.getMonthValue());

        LocalDate fechaInicioSuscripcion = LocalDate.now();
        System.out.println(fechaInicioSuscripcion);

        LocalDate fechaFinSuscripcion = fechaInicioSuscripcion.plusDays(7);

        System.out.println(fechaFinSuscripcion);




    }
}
