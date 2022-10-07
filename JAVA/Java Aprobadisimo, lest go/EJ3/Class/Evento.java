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
public class Evento extends Recital {
    private String NombreBanda;
    
    private String Motivo;
    private String NombreContratante;
    private int Dia;
    
    private double CostosTotales;
    
    public Evento(String unNombreBanda, int unaCantidad, String unMotivo, String unNombreContratante, int unDia){
        
        super(unNombreBanda, unaCantidad);
        
        Motivo = unMotivo;
        NombreContratante = unNombreContratante;
        Dia = unDia;
        
        CostosTotales = 0;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getNombreContratante() {
        return NombreContratante;
    }

    public void setNombreContratante(String NombreContratante) {
        this.NombreContratante = NombreContratante;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void Actuar(){
         if(Motivo == "Beneficiencia"){
             System.out.println("Recuerden colaborar con " + NombreContratante);
         }else if(Motivo == "Show"){
             System.out.println("Saludos amigos televidentes");
         }else{
             System.out.println("Un feliz cumpleaños para " + NombreContratante);
         }
         
         super.Actuar();
     }
    
    public double CalcularCostos(){
        if(Motivo == "Beneficiencia"){
             CostosTotales = 0;
         }else if(Motivo == "Show"){
             CostosTotales = 50000;
         }else{
             CostosTotales = 150000;
         }
        
        return CostosTotales;
    }
}
