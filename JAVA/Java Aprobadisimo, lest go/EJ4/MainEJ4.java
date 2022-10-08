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
public class Parte4yfnalSEAPRUEBACARAJOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoroSemiCircular Prueba = new CoroSemiCircular("MODO DIABOLICOS",3, "VALENTIN", 44933907, 19, 1);
        CoroHilera Prueba2 = new CoroHilera(3, 3, "MODO DIABOLICOS", "VALENTIN", 44933907, 19, 1);
        
        Prueba.AgregarCorista("JA", 1, 1, 3); // 3 > 2 1
        Prueba.AgregarCorista("JA2", 2, 2, 2); // 2 > 1 2
        Prueba.AgregarCorista("JA2", 2, 2, 1); // 
        //System.out.println(Prueba.BienFormado());
        
        Prueba2.AgregarCorista("JA", 1, 1, 3);
        Prueba2.AgregarCorista("JA", 1, 1, 3);
        Prueba2.AgregarCorista("JA", 1, 1, 3);
        
        Prueba2.AgregarCorista("JA", 1, 1, 3);
        Prueba2.AgregarCorista("JA", 1, 1, 3);
        Prueba2.AgregarCorista("JA", 1, 1, 3);
        
        Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
         Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
         Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
         Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
        Prueba2.AgregarCorista("JA", 1, 1, 4);
        
        //System.out.println(Prueba2.BienFormado());
        
        System.out.println(Prueba.toString());
        System.out.println(Prueba2.toString());
    }
    
}
