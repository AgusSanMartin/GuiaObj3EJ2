package com.company;

public class Staff extends Persona{
    private double salario;
    private boolean turno;

    public Staff(String d,String n,String a,String e,String dir,double s,boolean t){
        super(d,n,a,e,dir);
        this.salario = s;
        this.turno = t;
    }

    public double getSalario() { return salario; }

    public double getSalarioAnual(){ return getSalario() * 12; }

    public String getTurno() {
        if (this.turno == true) return "noche";else return "mañana";
    }

    @Override
    public String toString() {
        return super.toString() +
                " Salario anual: " + getSalarioAnual() +
                " Turno: " + getTurno();
    }
}
