/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author theVa
 */
public abstract class  Empleado {
    private String Nombre;
    private double Sueldo;
    private int Antiguedad;
    
    public Empleado(String unNombre, double unSueldo, int unaAntiguedad){
        Nombre = unNombre;
        Sueldo = unSueldo;
        Antiguedad = unaAntiguedad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

     public double SueldoACobrar(){
        return Sueldo + (0.1 * Antiguedad);
    }
   
    public String toString(){
        String aux = "Nombre: "+ Nombre + ", Antiguedad: " + Antiguedad + ", sueldo: " + this.SueldoACobrar() + " con una efectividad de " + this.Efectividad();
        return aux;
    }
    public abstract double Efectividad();
}
