package tema1;
import PaqueteLectura.Lector;


public class Ej02Jugadores {

  
    public static void main(String[] args) {
          int DimF = 3;
 
          double [] alturas = new double[DimF];
          
          int i;
          double prom = 0;
          double n;
          for (i = 0; i < DimF ;i++){
          System.out.println(i+1 + ": ");
          n = Lector.leerDouble();
          alturas[i] = n;
          prom = prom + n;
          }
          prom = prom / DimF;
          System.out.println("Promedio: " + prom);
          
          int cantMayorProm = 0;
          
          for (i = 0; i < DimF ;i++){
              if(alturas[i] > prom){
                  cantMayorProm++;
              }
          }
          System.out.println("Cantidad de pj con altura mayor al promedio: " + cantMayorProm);
    }
    
}
