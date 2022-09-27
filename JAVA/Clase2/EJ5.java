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
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partido Partidos[] = new Partido[5];
        
        String local, visitante;
        int golesLocal,golesVisitante;
        
        int i, GanadosRiver, GolesBocaLocal;
        int DimL = 0;
        
        GanadosRiver = 0;
        GolesBocaLocal = 0;
        
        System.out.println("Ingrese el equipo local");
        local = Lector.leerString();
        System.out.println("Ingrese el equipo visitante");
        visitante = Lector.leerString();
        System.out.println("Ingrese los goles del local ");
        golesLocal = Lector.leerInt();
        System.out.println("Ingrese los goles del visitante ");
        golesVisitante = Lector.leerInt();
        
        i = 0;
        while(!visitante.equals("ZZZ") && i < 5){
            Partidos[i] = new Partido(local, visitante, golesLocal, golesVisitante);
            
            System.out.println("Ingrese el equipo local");
            local = Lector.leerString();
            System.out.println("Ingrese el equipo visitante");
            visitante = Lector.leerString();
            System.out.println("Ingrese los goles del local ");
            golesLocal = Lector.leerInt();
            System.out.println("Ingrese los goles del visitante ");
            golesVisitante = Lector.leerInt();
            
            DimL++;
            i++;
        }
        i = 0;
        while(i < DimL){
            System.out.println(Partidos[i].getLocal() + " " + Partidos[i].getGolesLocal() + " ---------- " + Partidos[i].getVisitante() + " " + Partidos[i].getGolesVisitante());
            
            if(Partidos[i].getGanador().equals("River")) GanadosRiver++;
            
            if(Partidos[i].getLocal().equals("Boca")) GolesBocaLocal = GolesBocaLocal + Partidos[i].getGolesLocal();
            
            i++;
        }
        
        System.out.println("River gano " + GanadosRiver + " partidos.");
        System.out.println("Boca metio " + GolesBocaLocal + " goles jugando de local.");
    }
    
}
