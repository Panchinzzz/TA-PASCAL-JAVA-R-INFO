/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;

/**
 *
 * @author theVa
 */
public class EJ2XD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento prueba = new Estacionamiento("Estacionamiento Banegas", "General Roca", 9, 22, 3, 3);
        Auto Autito = new Auto("Valen", 1992);

        prueba.Estacionar(Autito, 1, 1);
        prueba.Estacionar(Autito, 2, 2);
        prueba.Estacionar(Autito, 3, 3);
        prueba.Estacionar(Autito, 1, 2);
        prueba.Estacionar(Autito, 2, 3);
        prueba.Estacionar(Autito, 3, 2);

        System.out.println(prueba.LeerEstacionamiento());
        System.out.println(prueba.CantidadPlaza(1));
        System.out.println(prueba.Estacionado(1993));
    }

}
