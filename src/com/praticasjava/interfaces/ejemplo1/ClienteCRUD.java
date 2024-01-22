package com.praticasjava.interfaces.ejemplo1;

public interface ClienteCRUD {

    //Recuperar

    String BuscarPorNif(String nif);

    //Guardar

    void guardar(String cliente);

    //Actualizar

    void actualizar(String cliente);


    //Borrar

}
