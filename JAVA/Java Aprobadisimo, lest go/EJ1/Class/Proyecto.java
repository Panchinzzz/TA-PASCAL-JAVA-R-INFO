/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

/**
 *
 * @author theVa
 */
public class Proyecto {
    private String Nombre;
    private int Codigo;
    private String NombreDirector;
    
    private int DimL;
    private Investigador[] Investigadores = new Investigador[5];
    
    private double TotalSubsidios;
    
    public Proyecto(String unNombre, int unCodigo, String unNombreDirector){
        
        Nombre = unNombre;
        Codigo = unCodigo;
        NombreDirector = unNombreDirector;
        
        DimL = 0;
        TotalSubsidios = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreDirector() {
        return NombreDirector;
    }

    public void setNombreDirector(String NombreDirector) {
        this.NombreDirector = NombreDirector;
    }
    
    public boolean Disponibilidad(){
        boolean ok = true;
        if(DimL == 5) ok = false;
        return ok;
    }
    
    public void AgregarInvestigador(String unNombre, int unaCategoria, String unaEspecialidad){
       if(Disponibilidad()){
           Investigadores[DimL] = new Investigador(unNombre, unaCategoria, unaEspecialidad);
           DimL++;
       }
    }
    
    public double TotalMontoSubsidios(){
        int i;
        for(i = 0; i < DimL; i++){
            TotalSubsidios = TotalSubsidios + Investigadores[i].getMontoInvestigador();
        }  
        
        return TotalSubsidios;
    }
    
    public Investigador getInvestigador(int i){
        return Investigadores[i];
    }
    
    public void Otorgar(String unNombre){
        
        int i = 0;
        boolean ok = true;
        while((ok)&&(i < DimL)){
            if(getInvestigador(i).getNombre().equals(unNombre)){
                getInvestigador(i).OtorgarSubsidios();
                ok = false;
            }
            
            i++;
        }
        
    }

    
    
    @Override
    public String toString() {
        
        String aux = "";
        int i = 0;
        
        while(i < DimL){
            aux = aux + Investigadores[i].toString() + "\n";
            i++;
        }
        
        return "Nombre: " + Nombre + "\nCodigo: " + Codigo + "\nNombre Del Director: " + NombreDirector + "\nTotal de dinero otorgado del proyecto: " + TotalMontoSubsidios() + "\nInformacion de los investigadores: "
                + "\n" + aux;
    }
    
    
}
