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
public class MainEJ2P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador Jugador = new Jugador(20, 30, "Riquelme", 400000, 3);
        Entrenador Entrenador = new Entrenador(19, "Gallardo", 300000, 8);
        
        System.out.println(Jugador.toString());
        System.out.println(Entrenador.toString());
    }
    
}
