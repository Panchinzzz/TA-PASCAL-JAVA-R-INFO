package parte3xd;

/**
 *
 * @author theVa
 */
public class PARTE3XD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Evento Prueba = new Evento("YSY A", 4, "Privado",  "MODO DIABLO", 20);
        Gira Prueba2 = new Gira("YSY A", 2, "MODO DEMOLEDOR", 11);
        
        
        Prueba.AgregarTemas("Alma");
        Prueba.AgregarTemas("Bardos y Verdades");
        Prueba.AgregarTemas("Desfilar mis penas");
        
        Prueba2.AgregarTemas("Traje unos tangos");
        Prueba2.AgregarTemas("Linaje");
        
        Prueba2.AgregarFecha("Bragado", 20);
        Prueba2.AgregarFecha("Alberti", 0);
        Prueba2.AgregarFecha("La Plata", 8);
        
        System.out.println(Prueba.CalcularCostos());
        Prueba.Actuar();
        
        System.out.println(Prueba2.CalcularCostos());
        Prueba2.Actuar();
        Prueba2.Actuar();
        Prueba2.Actuar();
    }
    
}
