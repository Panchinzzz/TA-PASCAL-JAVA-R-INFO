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
public class Estacionamiento {
    private int Apertura;
    private int Cierre;
    private int piso;
    private int plaza;
    private int ContadorPlaza;
    Estacion [][] Estacionamientos;
    
    public Estacionamiento(String Nombre, String Direccion){
        Apertura = 8;
        Cierre = 21;
        piso = 5;
        plaza = 10;
        Estacionamientos = new Estacion[5][10];
        int i;
        int j;
        
        for(i = 0; i < 5; i++){
            
            for(j = 0; j < 10; j++){
               Estacionamientos[i][j] = new Estacion();
                
            }
            
            j = 0;
        }
    }

    public Estacionamiento(String Nombre, String Direccion, int unaApertura, int unCierre, int unpiso, int unaplaza){
        Apertura = unaApertura;
        Cierre = unCierre;
        Estacionamientos = new Estacion[unpiso][unaplaza];
        
        int i;
        int j;
        
        piso = unpiso;
        plaza = unaplaza;
        for(i = 0; i < piso; i++){
            
            for(j = 0; j < plaza; j++){
               Estacionamientos[i][j] = new Estacion();
                
            }
            
            j = 0;
        }
        
        
    }
    
    public int getApertura() {
        return Apertura;
    }

    public void setApertura(int Apertura) {
        this.Apertura = Apertura;
    }

    public int getCierre() {
        return Cierre;
    }

    public void setCierre(int Cierre) {
        this.Cierre = Cierre;
    }
    
    public void Estacionar(Auto unAuto, int X, int Y){
        if(Estacionamientos[X-1][Y-1].isDisponibilidad()){
            Estacionamientos[X-1][Y-1].AgregarAuto(unAuto);
        }
    }
    
    
    
    public String Estacionado(int unaPatente){
        int i = 0;
        int j = 0;
        boolean ok = true;
        while((ok) && (i < piso)){
            
            while((ok) && (j < piso)){
                if(!Estacionamientos[i][j].isDisponibilidad()){
                    
                    if(Estacionamientos[i][j].getAuto().getPatente() == unaPatente) {
                    ok = false;
                }
                    
                }
                if(ok){
                 j++;   
                }
            }
            if(ok){
            j = 0;
            i++;  
            }
      
        }
        
        if(ok) return "“Auto Inexistente";
        return "Se encuentra el auto con patente: "+ unaPatente + " en el piso "+ (i+1) + " en la plaza " + (j+1);
    }

    public String LeerEstacionamiento(){
        String aux = "";
        int i = 0;
        int j = 0;
        
        while(i < piso){
            
            while(j < plaza){
                
                if(Estacionamientos[i][j].isDisponibilidad()) aux = aux + "\n Piso " + (i+1) + " plaza " + (j+1) + " esta libre";
                else{
                    aux = aux + "\n Piso " + (i+1) + " plaza " + (j+1) + " tiene al auto con " + Estacionamientos[i][j].getAuto().toString();
                }
                
                j++;
            }
            j = 0;
            i++;
        }
        
        return aux;
    }
    public int CantidadPlaza(int Y){
        int i;
        ContadorPlaza = 0;
        for(i = 0; i < piso; i++){
            if(!Estacionamientos[i][Y-1].isDisponibilidad()) ContadorPlaza++;
        }
    return ContadorPlaza;
}
