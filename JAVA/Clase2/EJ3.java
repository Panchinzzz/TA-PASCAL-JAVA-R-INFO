package tema2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author theVa
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GeneradorAleatorio.iniciar();
        Persona Personas[] = new Persona[15];
        Persona MinDNI = null;
        
        int DNI, Edad, DimL, cant, MinDni;
        String Nombre;

        DNI = GeneradorAleatorio.generarInt(44);
        Edad = GeneradorAleatorio.generarInt(80);
        Nombre = GeneradorAleatorio.generarString(10);

        int i = 0;
        
        MinDni = 44;
        cant = 0;
        while ((Edad != 0) && (i < 15)) {
            Personas[i] = new Persona();
            Personas[i].setDNI(DNI);
            Personas[i].setEdad(Edad);
            Personas[i].setNombre(Nombre);
            
            if(DNI < MinDni){
                MinDNI = new Persona(Nombre, DNI, Edad);
                MinDni = DNI;
            }
            
            if (Edad > 65) {
                cant++;
            }

            DNI = GeneradorAleatorio.generarInt(44);
            Edad = GeneradorAleatorio.generarInt(18);
            Nombre = GeneradorAleatorio.generarString(10);

            i++;
        }
        DimL = i;

        for (i = 0; i < DimL; i++) {
            System.out.println(Personas[i].toString());

        }
        System.out.println("Cantidad de personas con mas de 65 años: " + cant);
       if(MinDni != 44) System.out.println(MinDNI.toString()+ " y soy la persona con menor DNI");
    }

}
