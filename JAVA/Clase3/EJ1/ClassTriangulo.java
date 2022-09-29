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
public class Triangulo {
    private double  l1, l2, l3;
    private String ColorRelleno, ColorBorde;
    
    public Triangulo(double lado1, double lado2, double lado3){
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
    }
    public Triangulo(){
        l1 = 0;
        l2 = 0;
        l3 = 0;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public String getColorRelleno() {
        return ColorRelleno;
    }

    public void setColorRelleno(String ColorRelleno) {
        this.ColorRelleno = ColorRelleno;
    }

    public String getColorBorde() {
        return ColorBorde;
    }

    public void setColorBorde(String ColorBorde) {
        this.ColorBorde = ColorBorde;
    }
    
    public double getPerimetro(){
        double perimetro;
        perimetro = l1 + l2 + l3;
        return perimetro;
    }
    public double getArea(){
        double s;
        double area;
        s = (l1+l2+l3)/2;
        area = Math.sqrt(s*(s-l1) * (s- l2) * (s - l3));
        return area;
    }
    
}
