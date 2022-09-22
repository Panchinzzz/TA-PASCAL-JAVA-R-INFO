package tema1;
import PaqueteLectura.GeneradorAleatorio;
//Paso 1. importar la funcionalidad para generar datos aleatorios

public class Ej03Matrices {

    public static void main(String[] args) {
        int DimF = 5;
        int[][] matriz = new int [DimF][DimF];
        int [] suma = new int [DimF];
        
        int i;
        int j;
        int n;
        
        for(i = 0; i< DimF; i++){
            suma[i] = 0;
        }
        
        for(i= 0; i< DimF; i++){
            for(j= 0; j< DimF; j++){
                n = GeneradorAleatorio.generarInt(31);
                matriz[i][j] = n;
                suma[i] = suma[i] + n;
            }      
        }
          for(i= 0; i< DimF; i++){
            for(j= 0; j< DimF; j++){
                System.out.println("Estas en fila " + (i+1) + " Columna " + (j+1) + " Con valor: " + matriz[i][j]);
            }      
        }
         for(i = 0; i< DimF; i++){
            System.out.println("Suma de la fila " + (i+1) + ": " + suma[i]);
        }
        
         i = 0;
         j = 0;
        int encontrar = 27;
        boolean ok = true;
        while( (i<5) && (ok)){
            while((j< 5) && (ok)){
            
                if(matriz[i][j] == encontrar){
                    System.out.println("El " + encontrar + " se encontro en la fila " + (i+1) + " en la columna " + (j+1));
                    ok = false;
                }
            
            j++;
            }
         j = 0; 
         i++;
         if((i == 5) && ok){
             System.out.println("Lpm, no encuentro el numero, re dificil xd");
         }
        }
    }
}
