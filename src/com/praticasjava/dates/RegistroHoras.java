package com.praticasjava.dates;

import java.io.Serializable;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


import java.io.*;


public class RegistroHoras implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<LocalTime> horasEntrada;

    public RegistroHoras() {
        this.horasEntrada = new ArrayList<>();
    }

    public void registrarEntrada() {
        LocalTime horaEntrada = LocalTime.now();
        horasEntrada.add(horaEntrada);
        System.out.println("Entrada registrada a las " + horaEntrada);
    }

    public List<LocalTime> getHorasEntrada() {
        return horasEntrada;
    }

    public void guardarPersistencia(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this);
            System.out.println("Persistencia guardada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RegistroHoras cargarPersistencia(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (RegistroHoras) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        RegistroHoras registro = new RegistroHoras();

        // Llama al método para registrar la hora de entrada
        registro.registrarEntrada();

        // Guarda la persistencia en un archivo
        registro.guardarPersistencia("registroHoras.ser");

        // Carga la persistencia desde el archivo
        RegistroHoras registroCargado = RegistroHoras.cargarPersistencia("registroHoras.ser");

        // Muestra las horas de entrada almacenadas
        if (registroCargado != null) {
            System.out.println("Horas de entrada almacenadas: " + registroCargado.getHorasEntrada());
        }
    }
}
