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
public class Fecha {
    private String Ciudad;
    private int Dia;

    
    public Fecha(String unaCiudad, int unDia){
        Ciudad = unaCiudad;
        Dia =  unDia;
    }
    
    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }
    
    
}
