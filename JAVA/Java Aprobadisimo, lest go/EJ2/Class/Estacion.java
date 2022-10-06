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
public class Estacion {
    private boolean Disponibilidad;
    private Auto Auto;
    
    
    public Estacion(){
        Disponibilidad = true;     
    }
    
    public void AgregarAuto(Auto unAuto){
        Auto = new Auto(unAuto.getNombreDueño(), unAuto.getPatente());
        Disponibilidad = false;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }
    public Auto getAuto(){
        return Auto;
    }
    
}
