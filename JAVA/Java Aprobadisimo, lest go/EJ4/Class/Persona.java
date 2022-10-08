/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte4yfnalseapruebacarajoo;

/**
 *
 * @author theVa
 */
public abstract class Persona {
    private String Nombre;
    private int DNI;
    private int Edad;
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        Nombre = unNombre;
        DNI = unDNI;
        Edad = unaEdad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
