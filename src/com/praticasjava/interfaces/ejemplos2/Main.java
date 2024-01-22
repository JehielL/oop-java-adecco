package com.praticasjava.interfaces.ejemplos2;

public class Main {

   // static NotificationService notificationService;

    public static void main(String[] args) {

        NotificationService notificadorEmail = new NotificationServiceEmail();
        NotificationService notificadorSMS = new NotificationServiceSMS();



        UserRegistration userRegistration = new UserRegistration(notificadorEmail);
        userRegistration.registrarUsuario("prueba@gmail.com");

        UserRegistration userRegistrationSms = new UserRegistration(notificadorSMS);
        userRegistrationSms.registrarUsuarioSms("622134504");

    }
}
