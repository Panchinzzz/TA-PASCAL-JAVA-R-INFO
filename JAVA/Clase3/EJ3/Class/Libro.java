/*
Clase Libro a la cual se agregaron constructores. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
public class Libro {
   private String titulo;
   private Autor primerAutor; 
   private String editorial;
   private int añoEdicion;
   private String ISBN; 
   private double precio; 
     
    
    public Libro(String unTitulo,  String unaEditorial, 
    int unAñoEdicion, String unISBN, double unPrecio, String UnNombre, String UnaBiografia, String UnOrigen){
         titulo = unTitulo;
         editorial = unaEditorial; 
         añoEdicion= unAñoEdicion;
         primerAutor = new Autor(UnNombre, UnaBiografia, UnOrigen);
         ISBN =  unISBN;
         precio = unPrecio;
    }
    
    public Libro(  String unTitulo,  String unaEditorial, String unISBN, String UnNombre, String UnaBiografia, String UnOrigen){
         titulo = unTitulo;
         editorial = unaEditorial; 
         añoEdicion= 2015;
         primerAutor = new Autor(UnNombre, UnaBiografia, UnOrigen);
         ISBN =  unISBN;
         precio = 100;
    }
    
    public Libro(){
        primerAutor = new Autor();
    }
        
    public String getTitulo(){
        return titulo;
    }
  
    public String getEditorial(){
        return editorial;
    }
    public int getAñoEdicion(){
        return añoEdicion;
    }
  
    public Autor getPrimerAutor(){
        return primerAutor;
    } 
    public String getISBN(){
        return ISBN;
    } 
    public double getPrecio(){
        return precio;
    }
   
    public void setTitulo(String unTitulo){
        titulo = unTitulo;
    }
   
    public void setEditorial(String unaEditorial){
         editorial = unaEditorial;
    }
    public void setAñoEdicion(int unAño){
         añoEdicion = unAño;
    }
   
    public void setPrimerAutor(String UnNombre, String UnaBiografia, String UnOrigen){
         primerAutor = new Autor(UnNombre, UnaBiografia, UnOrigen);
    } 
    public void setISBN(String unISBN){
         ISBN=unISBN;
    } 
    public void setPrecio(double unPrecio){
         precio=unPrecio;
    }
   
    
   @Override
    public String toString(){
        String aux;
        aux= titulo + " por " + primerAutor + " - " + añoEdicion + " - " + " ISBN: " + ISBN;
       return ( aux);
    }
        
}
