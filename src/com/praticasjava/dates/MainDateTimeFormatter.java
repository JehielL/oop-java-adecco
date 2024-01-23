package com.praticasjava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainDateTimeFormatter {


    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale spainLocale = Locale.of("es", "ES");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", spainLocale);

        String fechaFormateada = hoy.format(formatter);
        System.out.println(fechaFormateada);




    }
}
