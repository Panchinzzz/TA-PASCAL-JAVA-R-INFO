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
public class Ej5p5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VisorFifurasModificado NuevoVisor = new VisorFifurasModificado();
       Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");
       Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");
       Cuadrado c2= new Cuadrado(30,"Rojo","Naranja");
       
       NuevoVisor.mostrar(c1);
       NuevoVisor.mostrar(r);
       NuevoVisor.mostrar(c2);
       NuevoVisor.mostrar(c1);
       NuevoVisor.mostrar(r);
       NuevoVisor.mostrar(c2);
       
       System.out.println("-------------------------------");
       
       NuevoVisor.Almacenadas();
    }
    
}
