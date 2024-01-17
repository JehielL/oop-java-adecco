package com.praticasjava.herencia3;

public class MetodoDePagoPaypal extends MetodoDePago {

    private String email;
    private String token;

    // CONSTRUCTOR
    public MetodoDePagoPaypal() {
    }

    public MetodoDePagoPaypal(String nombreEmisor, String nombreReceptor,
                              String numFactura, double cantidad, String email, String token) {
        super(nombreEmisor, nombreReceptor, numFactura, cantidad);
        this.email = email;
        this.token = token;
    }

    //GETTER AND SETTER

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    // OVERRIDE


    @Override
    public boolean realizarPago() {
        System.out.println("Inicializando pago con paypal");
        System.out.println("Transfiriendo");
        return true;
    }

    //toString


    @Override
    public String toString() {
        return "MetodoDePagoPaypal{" +
                "email='" + email + '\'' +
                ", token='" + token + '\'' +
                ", nombreReceptor='" + nombreReceptor + '\'' +
                '}';
    }
}
