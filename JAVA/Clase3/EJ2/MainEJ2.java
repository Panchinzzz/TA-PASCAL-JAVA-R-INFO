/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1= new  Libro( "Java: A Beginner's Guide", "Mcgraw-Hill", 201, "978-0071809252", 21.72, " Herbert Schildt", "Quien carajo lo conoce xd", "De Albertio creo");
        Libro libro2= new Libro("Learning Java by Building Android Games", "CreateSpace Independent Publishing", "978-1512108347", "John Horton", "Y este PJ quien es", "Ni idea, me mataste mostro");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        System.out.println(libro2.getPrimerAutor().toString());
    }
    
}
