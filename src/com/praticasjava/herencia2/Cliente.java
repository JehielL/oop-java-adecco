package com.praticasjava.herencia2;

public class Cliente extends Empleado{

    private String email;

    public Cliente (String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                '}';
    }
}
