package com.praticasjava.herencia2;

public class Empleado  extends  Usuario{

   private String nss;

    public Empleado(){

    }


    public Empleado(String nombre, String apellido, String nss) {
        super(nombre, apellido);
        this.nss = nss;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                "apellido='" + getApellido() + '\'' +
                " nss='" + nss + '\'' +
                '}';
    }
}
