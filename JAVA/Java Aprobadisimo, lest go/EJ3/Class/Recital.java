/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte3xd;

/**
 *
 * @author theVa
 */
public abstract class Recital {
    private String NombreBanda;
    private String [] Canciones;
    private int DimL;
    private int DimF;
    
    public Recital(String unNombreBanda, int unaCantidad){
        
        NombreBanda = unNombreBanda;
        Canciones = new String[unaCantidad];
        DimL = 0;
        DimF = unaCantidad;
    }

    public String getNombreBanda() {
        return NombreBanda;
    }

    public void setNombreBanda(String NombreBanda) {
        this.NombreBanda = NombreBanda;
    }
    
    public boolean Disponibilidad(){
        boolean ok = true;
        if (DimL == DimF) ok = false;
        return ok;
    }
    
    public void AgregarTemas(String unNombreTema){
        if(Disponibilidad()){         
            Canciones[DimL] = unNombreTema;
            DimL++;        
        }
    }
    
    public void Actuar(){
        int i;
        
        for(i = 0; i < DimL; i++){
            System.out.println("Y ahora se tocara el tema: " + Canciones[i]);
        }
    }
    abstract public double CalcularCostos();
}
