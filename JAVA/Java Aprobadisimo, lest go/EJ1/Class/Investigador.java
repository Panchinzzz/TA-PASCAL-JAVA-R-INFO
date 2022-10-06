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
public class Investigador {
    private String Nombre;
    private int Categoria;
    private String Especialidad;
    
    private int DimL;
    private Subsidio [] Subsidios = new Subsidio[5];
    
    private double TotalSubsidio;
    
    public Investigador(String unNombre, int unaCategoria, String unaEspecialidad){
        
        Nombre = unNombre;
        Categoria = unaCategoria;
        Especialidad = unaEspecialidad;
        DimL = 0;
        TotalSubsidio = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public double getMontoInvestigador(){
        return TotalSubsidio;
    }
    
    public boolean Disponibilidad(){
        boolean ok = true;
        if(DimL == 5) ok = false;
        return ok;
    }
    
    public void AgregarSubsidio(double unMonto, String unMotivo){
       if(Disponibilidad()){
           Subsidios[DimL] = new Subsidio(unMonto, unMotivo);
           DimL++;
          
       }
    }
    
    public void OtorgarSubsidios(){
        int i = 0;
        while(i < DimL){
            Subsidios[i].setOk(true);  
            TotalSubsidio = TotalSubsidio + Subsidios[i].getMonto();
            i++;
        }
    }
    
    public void VerSubsidios(){
         int i = 0;
        
        while(i < DimL){
            System.out.println(Subsidios[i].getOk());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Investigador{" + "Nombre=" + Nombre + ", Categoria=" + Categoria + ", Especialidad=" + Especialidad + ", Subsidios=" + TotalSubsidio + '}';
    }
    
}
