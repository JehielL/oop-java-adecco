package com.praticasjava.interfaces.ejemplo1;

public class ClienteCRUDMySql implements ClienteCRUD {
    @Override
    public String BuscarPorNif(String nif) {
        return "Cliente recuperado de MYSQL";
    }

    @Override
    public void guardar(String cliente) {

    }

    @Override
    public void actualizar(String cliente) {

    }
}
