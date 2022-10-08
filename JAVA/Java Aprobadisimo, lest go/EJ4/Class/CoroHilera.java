package parte4yfnalseapruebacarajoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theVa
 */
public class CoroHilera extends coro{
    private int DimLY;
    private int DimLX;
    private int DimFY;
    private int DimFX;
    
    private Corista[][] Coristas;
    
    public CoroHilera(int X, int Y, String unNombre,String NombreDirector ,int unDNI, int unaEdad, int unaAntiguedad){
        super(unNombre, NombreDirector, unDNI, unaEdad, unaAntiguedad);
        
        DimLY = 0;
        DimLX = 0;
        
        DimFY = Y;
        DimFX = X;
        
        Coristas = new Corista[X][Y];
    }
    
    public boolean Disponibilidad(){
        boolean Ok = true;
        if(DimLX == DimFX) Ok = false;
        return Ok;
    }
    
    public void AgregarCorista(String unNombre, int unDNI, int unaEdad, int unTono){
        if(Disponibilidad()){
            Coristas[DimLX][DimLY] = new Corista(unNombre, unDNI, unaEdad, unTono);
            DimLY++;
            
            if(DimLY == DimFY){
                DimLY = 0;
                DimLX++;
            }
        }
        
    }
    
    public boolean BienFormadoY(int x){
        int i = 0;
        int max;
        boolean ok;
        int actual;
        
        if(x == DimLX) max = DimLY;
        else max = DimFY;
        
        
        actual = Coristas[x][i].getTonoFundamental();
        while ((i < max)&&(actual == Coristas[x][i].getTonoFundamental())){
           actual = Coristas[x][i].getTonoFundamental();
           i++;
        }
        
        if(i == max) return true;
        else return false;
        
    }
    
    public boolean BienFormado(){
        int i = 0;
        int actual;
        Boolean Ok;
      
        actual = Coristas[0][0].getTonoFundamental();
        Ok = BienFormadoY(i);

        while((i < DimLX)&&(Ok)&&(actual >= Coristas[i][0].getTonoFundamental())){
            actual = Coristas[i][0].getTonoFundamental();
            Ok = BienFormadoY(i);
            i++;
        }
        System.out.println(i);
        System.out.println(DimLX);
      if(i == DimLX){
          if(Ok) return true;
          else return false;
      }else return false;
    }
    
     public String toString(){
        String aux = "Nombre del coro: " + super.getNombre() + "Director:\n " + super.getDirector().toString() + "\nCoristas: ";
        int i = 0;
        int j = 0;
        int max;
        
        while(i < DimLX+1){
            
            if(i == DimLX) max = DimLY;
            else max = DimFY;
            
            while(j < max){
                aux = aux + "\n " + Coristas[i][j].toString();
                j++;
            }
            aux = aux + "\n";
            j = 0;
            i++;
        }
        
        return aux;
    }
    
}
//aux = aux + "\n " + Coristas[i][j].toString();
