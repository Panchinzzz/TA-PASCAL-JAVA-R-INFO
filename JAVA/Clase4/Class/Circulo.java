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
public class Circulo extends Figura {
    private double Radio;
    
    
    public Circulo(double unRadio, String unColorRelleno, String unColorLinea){
        super(unColorRelleno, unColorLinea);
        Radio = unRadio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public double calcularArea(){
        return Math.PI * Radio * Radio;
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * Radio;
    }
    
    public String toString(){
        String aux = super.toString();
        aux = aux + ". Este circulo tiene un radio de " + Radio;
        return aux;
    }
}
