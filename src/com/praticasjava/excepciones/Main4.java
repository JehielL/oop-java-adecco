package com.praticasjava.excepciones;

import com.praticasjava.clases.constructores.producto.Producto;

import java.util.NoSuchElementException;

public class Main4 {

    public static void main(String[] args) {

        try {
            findProductbyId(-5);

        }catch (IllegalArgumentException e){
            System.out.println("Id incorrecto");
        }
        try {
            findProductbyId(10);

        }catch (NoSuchElementException e){
            System.out.println("Id no encontrado");
        }


    }

    public static Producto findProductbyId(int id){

        if(id <= 0)
            throw new IllegalArgumentException();

        throw new NoSuchElementException();

    }
}

class ProductoDos {

}