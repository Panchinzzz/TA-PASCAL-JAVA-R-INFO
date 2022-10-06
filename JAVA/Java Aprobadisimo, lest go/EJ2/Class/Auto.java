/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;

/**
 *
 * @author theVa
 */
public class Auto {
    private String NombreDueño;
    private int Patente;
    
    public Auto(String unNombreDueño, int unaPatente){
        NombreDueño = unNombreDueño;
        Patente = unaPatente;
    }
    public Auto(){
        
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public int getPatente() {
        return Patente;
    }

    public void setPatente(int Patente) {
        this.Patente = Patente;
    }
    public String toString(){
        
        String aux = "Nombre del dueño: " + NombreDueño + ". Patente: " + Patente;
     
        
        return aux;
    }
    
}
