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
public class MainEJ4P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel Hotel = new Hotel(3);
        
        
        Hotel.PushCliente(1,"Valen", 19, 44933907);
        
        System.out.println(Hotel.toString());
        Hotel.Aumentar(13);
        System.out.println(Hotel.toString());
             
    }
    
}
