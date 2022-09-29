/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
      
public class Habitacion {
    private double Costo;
    private boolean Disponibilidad;
    private Cliente Cliente;
    
    
    public Habitacion(){
       Costo = GeneradorAleatorio.generarDouble(6000)+2000;
       Disponibilidad = true;
    }

    public double getCosto() {
        return Costo;
    }
    public boolean getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(String unNombre, int unaEdad, int unDNI) {
        this.Cliente = new Cliente(unNombre, unaEdad, unDNI);
    }
    public void AumentarCosto(int masCosto){
        Costo = Costo + masCosto;
    }
}
