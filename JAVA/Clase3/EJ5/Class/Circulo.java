/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author theVa
 */
public class Circulo {
    double Radio;
    String ColorRelleno, ColorLinea;
    
    public Circulo(double unRadio, String unColorRelleno, String unColorLinea){
        Radio = unRadio;
        ColorRelleno = unColorRelleno;
        ColorLinea = unColorLinea;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public String getColorRelleno() {
        return ColorRelleno;
    }

    public void setColorRelleno(String ColorRelleno) {
        this.ColorRelleno = ColorRelleno;
    }

    public String getColorLinea() {
        return ColorLinea;
    }

    public void setColorLinea(String ColorLinea) {
        this.ColorLinea = ColorLinea;
    }
    
    public double CalcularPerimetro(){
        return 2 * Math.PI * Radio;
    }
    public double CalcularArea(){
        return Math.PI * Radio * Radio;
    }
    
    public String toString(){
        String aux = "Este es un circulo con radio " + Radio + " de color " + ColorRelleno + " y de bordes " + ColorLinea;
        return aux;
    }
}
