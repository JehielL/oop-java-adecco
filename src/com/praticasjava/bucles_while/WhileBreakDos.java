package com.praticasjava.bucles_while;

public class WhileBreakDos {

    public static void main(String[] args) {
        String[] nombres = {"Jehiel", "Pedro", "Ramon", "Fran", "maria", "Wally"};

        boolean found = false;
        int i = 0 ;

        while (i < nombres.length){

            if (nombres[i].equals("Wally")){
                found = true;
                break;
            }
            i++;
        }

        if(found)
            System.out.println("Wally Encontrado");
        else
            System.out.println("Wally no encontrado");
    }
}
