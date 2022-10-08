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
public class coro {
    private String Nombre;
    private Director Director;

   
    
    public coro(String unNombre,String NombreDirector ,int unDNI, int unaEdad, int unaAntiguedad){
        Nombre = unNombre;
        
        Director = new Director(NombreDirector, unDNI, unaEdad, unaAntiguedad);

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public Director getDirector(){
        return Director;
    }
}
