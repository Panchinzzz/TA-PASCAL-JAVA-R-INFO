package tema4;

/**
 *
 * @author theVa
 */
public class MainEj3p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona Valen = new Persona("Valentin", 44933907, 19);
       Trabajador Matute = new Trabajador("Jardinero", "Matias", 45300293, 17);
       
       System.out.println(Valen.toString());
       System.out.println(Matute.toString());
    }
    
}
