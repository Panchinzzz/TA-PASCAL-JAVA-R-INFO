package tema1;
import PaqueteLectura.GeneradorAleatorio;
public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        
        
        //System.out.println("2." + "5" + "="+ tabla2[5]);
        int n = GeneradorAleatorio.generarInt(12);
        
        while (n != 11){
           System.out.println("2." + n + "="+ tabla2[n]);
           n = GeneradorAleatorio.generarInt(12);
        }
    }
}
