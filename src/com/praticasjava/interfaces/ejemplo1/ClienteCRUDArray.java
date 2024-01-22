package com.praticasjava.interfaces.ejemplo1;

public class ClienteCRUDArray implements ClienteCRUD {
    @Override
    public String BuscarPorNif(String nif) {
        return "Cliente recuperado de un Array";
    }

    @Override
    public void guardar(String cliente) {


    }

    @Override
    public void actualizar(String cliente) {

    }
}
