package com.praticasjava.interfaces.ejemplos2;

public class NotificationServiceSMS implements NotificationService {
    @Override
    public void enviarMensaje(String mensaje) {

        System.out.println("Mensaje enviado por SMS, Mensaje es: " + mensaje);


    }

    @Override
    public void confirmarEnvio(long id) {

    }
}
