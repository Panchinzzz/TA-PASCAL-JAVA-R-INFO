/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte4yfnalseapruebacarajoo;

/**
 *
 * @author theVa
 */
public class CoroSemiCircular extends coro {
    
    private Corista[] Coristas;
    
    private int DimL;
    private int DimF;
    
    
    public CoroSemiCircular(String unNombre, int CantCoristas,String NombreDirector ,int unDNI, int unaEdad, int unaAntiguedad){
        super(unNombre, NombreDirector, unDNI, unaEdad, unaAntiguedad);
        
        Coristas = new Corista[CantCoristas];
        DimL = 0;
        DimF = CantCoristas;
    }
    
    public boolean Disponibilidad(){
      boolean ok = true;
      if( DimL == DimF) ok = false;
      return ok;
    }
    
    public void AgregarCorista(String unNombre, int unDNI, int unaEdad, int unTono){
        if(Disponibilidad()){
            Coristas[DimL] = new Corista(unNombre, unDNI, unaEdad, unTono);
            DimL++;
        }
    }
    
    public boolean BienFormado(){
        int i = 0;
        boolean ok = true;
        int Actual;
        
        Actual = Coristas[i].getTonoFundamental();
        
        while((i < DimL)&&(Actual >= Coristas[i].getTonoFundamental())){
            Actual = Coristas[i].getTonoFundamental();
            
            i++;
        }
        System.out.println(i);
        System.out.println(DimL);
        if(i < DimL) ok = false;  
        return ok;
    }
    
    public String toString(){
        String aux = "Nombre del coro: " + super.getNombre() + "\nDirector: " + super.getDirector().toString() + "\nCoristas: ";
        int i;
        for(i = 0; i < DimL; i++){
            aux = aux + "\n " + Coristas[i].toString();
        }
        return aux;
    }
}
