package com.praticasjava.interfaces.ejemplo1;

public class Main {

    public static void main(String[] args) {

        ClienteCRUD operacionesCRUD = new ClienteCRUDMySql();

        String cliente = operacionesCRUD.BuscarPorNif("12346789g");

        System.out.println(cliente);

    }
}
