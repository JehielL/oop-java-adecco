package com.praticasjava.clases.constructores.usuario;

public class Usuario {

    long id;
    String fullName;
    String email;
    int age;
    boolean active;

    public Usuario() {
    }

    public Usuario(long id, String fullName, String email, int age, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.active = active;
    }

    public Usuario(long id, String fullName, String email, int age) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }
}
