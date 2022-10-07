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
public class Gira extends Recital{
    private String Nombre;
    private Fecha [] Fechas;
    private int NumeroFecha;
    
    private int DimL;
    private int DimF;
    
    public Gira(String unNombreBanda, int unaCantidad, String unNombre, int CantFechas){
        
        super(unNombreBanda, unaCantidad);
        
        Nombre = unNombre;
        Fechas = new Fecha[CantFechas];
        
        NumeroFecha = 0;
        DimL = 0;
        DimF = CantFechas;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public boolean Disponibilidad(){
        boolean ok = true;
        if (DimL == DimF) ok = false;
        return ok;
    }
    
     public void AgregarFecha(String unaCiudad, int unDia){
        if(Disponibilidad()){         
            Fechas[DimL] = new Fecha(unaCiudad, unDia);
            DimL++;        
        }
    }
    
     public void Actuar(){
         System.out.println("Buenas noches " + Fechas[NumeroFecha].getCiudad());
         super.Actuar();
         NumeroFecha++;
     }
     
     public double CalcularCostos(){
         return DimF * 30000;
     }
}
