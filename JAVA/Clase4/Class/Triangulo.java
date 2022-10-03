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
public class Triangulo extends Figura {
    private double L1, L2, L3;
    
    public Triangulo(double unL1, double unL2, double unL3, String unColorRelleno, String unColorLinea){
        super(unColorRelleno, unColorLinea);
        L1 = unL1;
        L2 = unL2;
        L3 = unL3;
    }

    public double getL1() {
        return L1;
    }

    public void setL1(double L1) {
        this.L1 = L1;
    }

    public double getL2() {
        return L2;
    }

    public void setL2(double L2) {
        this.L2 = L2;
    }

    public double getL3() {
        return L3;
    }

    public void setL3(double L3) {
        this.L3 = L3;
    }
    
    public double calcularArea(){
        double s;
        double area;
        s = (L1+L2+L3)/2;
        area = Math.sqrt(s*(s-L1) * (s- L2) * (s - L3));
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro;
        perimetro = L1 + L2 + L3;
        return perimetro;
    }
    
    public String toString(){
        String aux = super.toString();
        aux = aux + " Este triangulo tiene los siguientes lados:  " + L1 + " " + L2 + " " + L3;
        return aux;
    }
}
