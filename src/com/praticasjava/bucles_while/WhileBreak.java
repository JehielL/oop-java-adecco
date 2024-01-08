package com.praticasjava.bucles_while;

public class WhileBreak {

    public static void main(String[] args) {

        String[] nombres = {"Jehiel", "Pedro", "Ramon", "Fran", "maria"};
        String nombreBuscado = "ramon";
        int i = 0;

        while (i < nombres.length) {
            if(nombres[i].equals(nombreBuscado)){
                System.out.println("Nombre Encontrado " + nombreBuscado );
                break;
            }
            i ++;


        if (i == nombres.length){
            System.out.println("El nombre " + nombreBuscado + " No fue encontrado");
        }
        }

    }
}
