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
public class Trabajador extends Persona{
    private String Trabajo;
    
    public Trabajador(String unTrabajo,String unNombre, int unDNI, int unaEdad){
        super(unNombre, unDNI, unaEdad);
        Trabajo = unTrabajo;  
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }
    
    public String toString(){
       String aux = super.toString();
       aux = aux + " Soy " + Trabajo; 
       return aux;
    }
}
