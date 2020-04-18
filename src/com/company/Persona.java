package com.company;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona(String d,String n,String a,String e,String dir){
        this.dni = d;
        this.nombre = n;
        this.apellido = a;
        this.email = e;
        this.direccion = dir;
    }

    public String getDni() { return dni; }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getEmail() { return email; }

    public String getDireccion() { return direccion; }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre() +
                " Apellido: " + getApellido() +
                " DNI: " + getDni() +
                " Email: " + getEmail() +
                " Direccion: " + getDireccion();
    }
}
