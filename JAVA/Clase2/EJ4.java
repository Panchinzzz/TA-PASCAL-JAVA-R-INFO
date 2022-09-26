/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author theVa
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona Casting[][] = new Persona[3][2];

                
        int i, j;
        int Edad, DNI, DimLX, DimLY;
        String Nombre;
        boolean control;
        
        System.out.println("Ingrese el nombre");
        Nombre = Lector.leerString();
        System.out.println("Ingrese la edad");
        Edad = Lector.leerInt();
        System.out.println("Ingrese el dni");
        DNI = Lector.leerInt();
        
        i = 0;
        j = 0;
        
        while ((!Nombre.equals("ZZZ"))&&(i < 3)){
            
            while((!Nombre.equals("ZZZ"))&&(j < 2)){
                Casting[i][j] = new Persona(Nombre, DNI, Edad);
                
                System.out.println("Ingrese el nombre");
                Nombre = Lector.leerString();
                System.out.println("Ingrese la edad");
                Edad = Lector.leerInt();
                System.out.println("Ingrese el dni");
                DNI = Lector.leerInt();
                
                if(!Nombre.equals("ZZZ"))j++;
            }
            if(!Nombre.equals("ZZZ")) {
                i++;
                j = 0;
            }
        }
        DimLX = i;
        DimLY = j;
        control = true;
        
        System.out.println(DimLX + " "+ DimLY);
        
        i = 0;
        j = 0;
        
        while(control && i < 3){
            
            while(control && j < 2 ){
             System.out.println(Casting[i][j].toString() + "Tengo cita en el casting el dia " + (i+1) + " en el turno " + (j+1));                 
             if((i==DimLX && j == DimLY)) control = false;
             j++;
            }
            j = 0;
            i++;
        }
    }
    
}
