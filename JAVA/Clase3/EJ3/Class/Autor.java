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
public class Autor {
    private String Nombre, Biografia, Origen;
    
    public Autor(String UnNombre, String UnaBiografia, String UnOrigen){
        Nombre = UnNombre;
        Biografia = UnaBiografia;
        Origen = UnOrigen;
    }
    public Autor(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }
    
    public String toString(){
        String msj;
        msj = "El autor: " + Nombre + ". Con la biografia: " + Biografia + ". De origen: " + Origen;
        return msj;
    }
    
}
