package tema3;
import PaqueteLectura.Lector;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theVa
 */
public class ej1p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Triangulo MiTriangulo;
       double l1, l2, l3;
       System.out.println("Ingrese el lado 1: ");
       l1 = Lector.leerDouble();
       System.out.println("Ingrese el lado 2: ");
       l2 = Lector.leerDouble();
       System.out.println("Ingrese el lado 3: ");
       l3 = Lector.leerDouble();
       
       MiTriangulo = new Triangulo(l1, l2, l3);
       
        System.out.println("---------------------------------------------");
       1
       System.out.println("Perimetro del triangulo con los lados " + MiTriangulo.getL1()+ " "+ MiTriangulo.getL2() + " " + MiTriangulo.getL3() + ": " + MiTriangulo.getPerimetro());
       
        System.out.println();
       
       System.out.println("Area del triangulo con los lados " + MiTriangulo.getL1()+ " "+ MiTriangulo.getL2() + " " + MiTriangulo.getL3() + ": " + MiTriangulo.getArea());
    }
    
}
