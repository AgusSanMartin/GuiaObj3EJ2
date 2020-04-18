package com.company;

import java.security.PublicKey;

public class Estudiante extends Persona{
    private String añoIngreso;
    private double cuotaMensual;
    private String Carrera;

    public Estudiante(String d,String n,String a,String e,String dir, String añ,double c, String ca){
        super(d,n,a,e,dir);
        this.añoIngreso = añ;
        this.cuotaMensual = c;
        this.Carrera = ca;
    }

    public String getAñoIngreso() { return añoIngreso; }

    public double getCuotaMensual() { return cuotaMensual; }

    public String getCarrera() { return Carrera; }

    @Override
    public String toString() {
        return super.toString() +
                " Año de ingreso: " + getAñoIngreso() +
                " Cuota: " + getCuotaMensual() +
                " Carrera: " + getCarrera();
    }
}
