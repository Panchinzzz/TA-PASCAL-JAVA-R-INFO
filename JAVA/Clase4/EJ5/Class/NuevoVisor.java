package tema4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theVa
 */
public class VisorFifurasModificado {
 
 private int mostradas;
 private int guardadas;
 private int capacidadMaxima=5;
 private Figura [] vector;

 public VisorFifurasModificado(){
     vector = new Figura[capacidadMaxima];
     guardadas = 0;
     mostradas = 0;
 }

 public void guardar(Figura f){
 if (quedaEspacio()){
     vector[guardadas] = f;
     guardadas++;
 }
 
}

public boolean quedaEspacio(){
 if (guardadas == 5) return false;
 return true;
 }

 public void mostrar(Figura f){
     System.out.println(f.toString());
     guardar(f);
     mostradas++;
 }
 public int getGuardadas() {
 return guardadas;
 }

 public void Almacenadas(){
     int i;
     for(i = 0; i < guardadas; i++){
         System.out.println(vector[i].toString());
     }
 }
}
