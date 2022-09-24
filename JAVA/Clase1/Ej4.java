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
         int DimFP = 8;
         int DimFO = 4;
         int [][] edificio = new int [DimFP][DimFO];
         
         int piso;
         int oficina;
         int i;
         int j;

        
         
         for(i=0; i< DimFP; i++){
             
          for(j=0; j< DimFO; j++){
              edificio[i][j] = 0;          
         }   
             
         }
        System.out.println("Ingrese el piso al que concurre");
        piso = Lector.leerInt();
        

            
        System.out.println("Ingrese la oficina a la que concurre");
        oficina = Lector.leerInt();
            
        
       

        while (piso < 9 ){
        edificio[(piso - 1)][(oficina-1)]++;
         
        System.out.println("Ingrese el piso al que concurre");
        piso = Lector.leerInt();
        
        if(piso < 9){
            
        System.out.println("Ingrese la oficina a la que concurre");
        oficina = Lector.leerInt();
            
        }
        }
         
         for(i=0; i< DimFP; i++){
             
          for(j=0; j< DimFO; j++){
              System.out.println("Estas en el piso: "+ (i+1) + ", oficina numero: "+ (j+1) + "//// En esta oficina hay " + edificio[i][j] + " personas");              
         }   
             
         }
         
     }
}
