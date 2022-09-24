/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;
import PaqueteLectura.Lector;
/**
 *
 * @author theVa
 */
public class java {
    
     public static void main(String[] args) {
         int DimFC = 5;
    int DimFR = 4;
   int [][] resena = new int [DimFC][DimFR];
    
   int i;
   int j;
   
         
   
   
   for(i=0; i < DimFC; i++){
          System.out.println("------------------------------------------------------");      
       System.out.println("Bienvenido persona numero: " + (i+1));
       System.out.println("Que tal le parecio (del 1 al 10) la atencion al cliente?: ");
       resena[i][0] = Lector.leerInt();
          System.out.println("------------------------------------------------------");
       System.out.println("Que tal le parecio (del 1 al 10) la calidad de la comida?: ");
       resena[i][1] = Lector.leerInt();
          System.out.println("------------------------------------------------------");
       System.out.println("Que tal le parecio (del 1 al 10) el precio?: ");
       resena[i][2] = Lector.leerInt();
       System.out.println("------------------------------------------------------");
       System.out.println("Que tal le parecio (del 1 al 10) el ambiente?: ");
       resena[i][3] = Lector.leerInt();
             
         }
   
   
      for(i=0; i < DimFC; i++){
             
                System.out.println("------------------------------------------------------");
              System.out.println("Datos persona numero: " + (i+1));
              
              System.out.println("Atencion al cliente: " + resena[i][0]+ "/10");
              System.out.println("Calidad de comida: " + resena[i][1]+ "/10"); 
              System.out.println("Precio: " + resena[i][2]+ "/10");
             System.out.println("Ambiente: " + resena[i][3]+ "/10");
         }
   
   
     }
}
