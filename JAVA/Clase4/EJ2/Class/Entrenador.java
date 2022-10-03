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
public class Entrenador extends Empleado{
    private int Campeonatos;

    
    public Entrenador(int unosCampeonatos, String unNombre, double unSalario, int unaAntiguedad){
        super(unNombre, unSalario, unaAntiguedad);
        Campeonatos = unosCampeonatos;  
    }

    public int getCampeonatos() {
        return Campeonatos;
    }

    public void setCampeonatos(int Campeonatos) {
        this.Campeonatos = Campeonatos;
    }
    
    public double Efectividad(){
        return (Campeonatos / getAntiguedad());
    }
    
    public double SueldoACobrar(){
        if(Campeonatos > 10) return  super.SueldoACobrar() + 50000;
        else if (Campeonatos > 5) return super.SueldoACobrar() + 30000;
        else if (Campeonatos > 1) return super.SueldoACobrar() + 5000;
        return super.SueldoACobrar();
    }
    public String toString(){
     String aux = super.toString();
     aux = aux + " .El entrenador tiene " + Campeonatos + " campeonatos";
     return aux;
    }
}
