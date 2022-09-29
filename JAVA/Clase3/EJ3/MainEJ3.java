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
public class EJ3P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estante MiEstante = new Estante(25);
        
        
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2018," ISBN XD", 10, "Valen2", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("no existe"," Editorial god", 2019," ISBN XD", 10, "QUIEN SERA?", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        MiEstante.pushLibro("Titulazo"," Editorial god", 2019," ISBN XD", 10, "Valen", "Mi vida", "Bragado");
        
      
        System.out.println(MiEstante.getLibroPorTitulo("no existe").getPrimerAutor().getNombre());
        System.out.println(MiEstante.getCantidad());
    }   
    
}
