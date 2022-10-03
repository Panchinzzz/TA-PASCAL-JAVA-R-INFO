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
public class Ej1P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Triangulo prueba = new Triangulo(2,3,4, "Verde", "Rojo");
       Circulo prueba2 = new Circulo(10, "Q", "R");
       
       System.out.println(prueba2.calcularArea());
       System.out.println(prueba2.toString());
       prueba2.Despintar();
       System.out.println(prueba2.toString());
      
    }
    
}
