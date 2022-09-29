/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
/**
 *
 * @author theVa
 */
public class Hotel {
    private int DimF;
    private int DimL;
    Habitacion[] Hotel;
    
    public Hotel(int unaDimF){
        DimF = unaDimF;
        DimL = 0;
        Hotel = new Habitacion[DimF];
        
        int i;
        for(i = 0; i < DimF; i++){
            Hotel[i] = new Habitacion();
        }
    }
    public void PushCliente(int x, String unNombre, int unaEdad, int unDNI){
        if(Hotel[x].getDisponibilidad()){
            Hotel[x].setCliente(unNombre, unaEdad, unDNI);
            Hotel[x].setDisponibilidad(false);
        }
    }
    public void Aumentar(int Cantidad){
        int i;
        for(i = 0; i < DimF; i++){
            Hotel[i].AumentarCosto(Cantidad);
        }  
    }
    public Habitacion getHabitacion(int x){
        return Hotel[x];
    }
    
    @Override
    public String toString(){
        int i;
        String aux = "";
        for(i = 0; i < DimF; i++){
            aux = aux + ("La habitacion numero " + i + " tiene un costo de " + Hotel[i].getCosto() + " pesos. Ahora mismo esta " + Hotel[i].getDisponibilidad());
            if(!Hotel[i].getDisponibilidad()) aux = aux + ". El cliente es " + Hotel[i].getCliente().getNombre() + ", tiene " + Hotel[i].getCliente().getEdad() + ". DNI: " + Hotel[i].getCliente().getDNI() + "\n";
            else aux = aux + "\n";
            aux = aux + "\n";
        }
        return aux;
    }
}
