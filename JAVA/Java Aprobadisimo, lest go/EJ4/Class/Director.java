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
public class Director extends Persona {
    private int Antiguedad;
    
    public Director(String unNombre, int unDNI, int unaEdad, int unaAntiguedad){
        super(unNombre, unDNI, unaEdad);
        Antiguedad = unaAntiguedad;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }
    public String toString(){
        String aux = "Nombre: " + super.getNombre() + " DNI: " + super.getDNI() + " Edad: " + super.getEdad() + " Antiguedad: " + Antiguedad;
        return aux;
    }
}
