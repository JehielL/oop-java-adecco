package com.praticasjava.interfaces.ejemplos2;

public class NotificationServiceEmail implements NotificationService {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por Email, Mensaje: " +  mensaje);


    }

    @Override
    public void confirmarEnvio(long id) {

    }
}
