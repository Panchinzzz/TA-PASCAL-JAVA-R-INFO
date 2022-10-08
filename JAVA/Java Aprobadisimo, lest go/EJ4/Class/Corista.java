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
public class Corista extends Persona {
    private int TonoFundamental;
    
    public Corista(String unNombre, int unDNI, int unaEdad, int unTono){
        super(unNombre, unDNI, unaEdad);
        TonoFundamental = unTono;
    }

    public int getTonoFundamental() {
        return TonoFundamental;
    }

    public void setTonoFundamental(int TonoFundamental) {
        this.TonoFundamental = TonoFundamental;
    }
    
    public String toString(){
        String aux = "Nombre: " + super.getNombre() + " DNI: " + super.getDNI() + " Edad: " + super.getEdad() + " Tono: "+ TonoFundamental;
        return aux;
    }
}
