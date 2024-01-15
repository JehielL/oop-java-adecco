package com.praticasjava.clases.telefono_movil;

public class TelefonoMovil {

    //atributos

    String fabricante;
    String modelo;
    int numCores;
    int ram;
    int rom;
    boolean encendido;

    public TelefonoMovil(){

    }

    public TelefonoMovil(String fabricante, String modelo, int numCores, int ram, int rom, boolean encendido) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numCores = numCores;
        this.ram = ram;
        this.rom = rom;
        this.encendido = encendido;
    }

    public void encender(){
        if(this.numCores > 0 && this.ram > 0)
            this.encendido = true;
    }

    public void apagar(){

            encendido = false;
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numCores=" + numCores +
                ", ram=" + ram +
                ", rom=" + rom +
                ", encendido=" + encendido +
                '}';
    }
}
