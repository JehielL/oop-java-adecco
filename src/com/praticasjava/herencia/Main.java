package com.praticasjava.herencia;

public class Main {


    public static void main(String[] args) {


        //Crear vehiculo

        Vehiculo newVehiculo = new Vehiculo("Ford", "Focus", 4);

        //Crear Bicicleta


        Bicicleta bic1 = new Bicicleta("Trek", "XTrail", 2, "Carbono", true, false);


        System.out.println(bic1.getFabricante());

    }
}
