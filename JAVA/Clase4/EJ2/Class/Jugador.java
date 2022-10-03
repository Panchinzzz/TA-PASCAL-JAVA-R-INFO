/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author theVa
 */
public class Jugador extends Empleado {
    private int Partidos;
    private int Goles;
    
    public Jugador(int unosPartidos, int unosGoles, String unNombre, double unSueldo, int unaAntiguedad){
        super(unNombre, unSueldo, unaAntiguedad);
        Partidos = unosPartidos;
        Goles = unosGoles;
    }

    public int getPartidos() {
        return Partidos;
    }

    public void setPartidos(int Partidos) {
        this.Partidos = Partidos;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Goles) {
        this.Goles = Goles;
    }
    
    public double Efectividad(){
        return Goles / Partidos;
    }
    
    public double SueldoACobrar(){
        double aux = super.SueldoACobrar();
        if(Efectividad() > 0.5) aux = aux + getSueldo();
        return aux;
        
    }
    
    public String toString(){
     String aux = super.toString();
     aux = aux + ". El jugador tiene " + Partidos + " partidos y " + Goles + " goles";
        
     return aux;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author theVa
 */
public class Jugador extends Empleado {
    private int Partidos;
    private int Goles;
    
    public Jugador(int unosPartidos, int unosGoles, String unNombre, double unSueldo, int unaAntiguedad){
        super(unNombre, unSueldo, unaAntiguedad);
        Partidos = unosPartidos;
        Goles = unosGoles;
    }

    public int getPartidos() {
        return Partidos;
    }

    public void setPartidos(int Partidos) {
        this.Partidos = Partidos;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Goles) {
        this.Goles = Goles;
    }
    
    public double Efectividad(){
        return Goles / Partidos;
    }
    
    public double SueldoACobrar(){
        double aux = super.SueldoACobrar();
        if(Efectividad() > 0.5) aux = aux + getSueldo();
        return aux;
        
    }
    
    public String toString(){
     String aux = super.toString();
     aux = aux + ". El jugador tiene " + Partidos + " partidos y " + Goles + " goles";
        
     return aux;
    }
}
