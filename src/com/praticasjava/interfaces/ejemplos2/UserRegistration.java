package com.praticasjava.interfaces.ejemplos2;

public class UserRegistration {

    //atributo

    private NotificationService sistemaNotificador;

    //constructores

    public UserRegistration(NotificationService sistemaNotificador) {
        this.sistemaNotificador = sistemaNotificador;
    }

    //metodos

    public void registrarUsuario(String email){
        sistemaNotificador.enviarMensaje("Confirme su email, enviado al: " + email);
    }

    public void registrarUsuarioSms(String numTelf){
        sistemaNotificador.enviarMensaje("Confirme su sms, enviado al: " + numTelf);
    }

}
