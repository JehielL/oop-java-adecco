package com.praticasjava.clases.constructores.usuario;

public class Main {

    public static void main(String[] args) {
        //apunta constructor sin parametros.
        Usuario user1 = new Usuario();
        System.out.println(user1);

        //apunta constructor con parametros.

        Usuario user2 = new Usuario(1, "Jehiel Linarez", "jehiellnhs@gmail.com",32,true);
        System.out.println(user2);

        // usuario con algunos parametros.

        Usuario user3 = new Usuario();
        user3.id = 3L;
        user3.fullName = "Carlos";
        user3.age = 28;
        user3.active = true;

        System.out.println(user3);





    }
}
