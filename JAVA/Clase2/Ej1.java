public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona Valen = new Persona("Valen", 44, 19);
       
        System.out.println(Valen.getEdad());
        System.out.println(Valen.getNombre());
        System.out.println(Valen.getDNI());
        
        System.out.println(Valen.toString());
    }
    
}
