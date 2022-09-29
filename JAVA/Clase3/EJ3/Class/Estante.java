/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author theVa
 */
public class Estante {
    int DimF;
    private int DimL;
    Libro[] Libros;
    
    public Estante(int unaDimensionFisica){
        DimF = unaDimensionFisica;
        DimL = 0;
        Libros = new Libro[DimF];
    }
    
    
    public int getCantidad(){
        return DimL;
    }
    
    public boolean getLleno(){
        boolean aux = false;
        if(DimL == DimF) aux = true;
        return aux;
    }
    
    public void pushLibro(String unTitulo,  String unaEditorial, int unAñoEdicion, String unISBN, double unPrecio, String UnNombre, String UnaBiografia, String UnOrigen){
        if(!getLleno()){
            Libros[DimL] = new Libro(unTitulo, unaEditorial, unAñoEdicion, unISBN, unPrecio, UnNombre, UnaBiografia, UnOrigen);
            DimL++;
        }
    }
    public Libro getLibroPorTitulo(String unTitulo){
        int i;
        for (i = 0; i < DimL; i++){
            if(Libros[i].getTitulo().equals(unTitulo)) return Libros[i];
        }
        return new Libro();
    }
}
