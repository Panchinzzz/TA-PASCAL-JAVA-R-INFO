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
public class Subsidio {
    private double Monto;
    private String Motivo;
    private Boolean Ok;
    
    public Subsidio(double unMonto, String unMotivo){
        
        Monto = unMonto;
        Motivo = unMotivo;
        Ok= false;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public Boolean getOk() {
        return Ok;
    }

    public void setOk(Boolean Ok) {
        this.Ok = Ok;
    }
        
}
