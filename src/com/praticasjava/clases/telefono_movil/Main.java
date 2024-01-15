package com.praticasjava.clases.telefono_movil;

public class Main {

    public static void main(String[] args) {



       TelefonoMovil iphone = new TelefonoMovil();
        iphone.modelo = "Iphone 15";
        iphone.fabricante = "Apple";
        iphone.numCores = 9;
        iphone.ram = 6;
        iphone.rom = 64;
        iphone.encendido = true;
        System.out.println(iphone);

        TelefonoMovil onePlus = new TelefonoMovil(
                "Google",
                "11T",
                7,
                8,
                32,
                false);
        System.out.println(onePlus);

        TelefonoMovil samsung =  new TelefonoMovil(
                "Samsung",
                "S21",
                9,
                12,
                64,
                false);
        System.out.println(samsung);

        TelefonoMovil xiaomi = new TelefonoMovil(
                "Xiaomi",
                "13T Plus",
                7,
                12,
                128,
                true);
        System.out.println(xiaomi);

        samsung.encender();
        System.out.println(samsung);

        samsung.apagar();
        System.out.println(samsung);
    }




}
