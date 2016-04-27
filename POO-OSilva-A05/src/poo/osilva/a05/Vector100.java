/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.osilva.a05;

import java.util.ArrayList;

/**
 *
 * @author A00509871
 * @param <T>
 */
public class Vector100<T> {
    
    private final T[] vector = (T[]) new Object[100];
    
    public boolean almacenarUltimoDisponible(T elemento){
        int i = 0;   
        boolean estuvoDisponible = false;
        while (i < vector.length && vector[i] != null) {            
            i++;
        }        
        if (i < vector.length){
         vector[i] = elemento;
         estuvoDisponible = true;
        }
        
        return estuvoDisponible;
    }
    
    public boolean almacenarEnPosicion(int posicion, T elemento){
        boolean estuvoDisponible = false;        
        if ((posicion < vector.length) && (posicion >= 0) && (vector[posicion] == null)){
            vector[posicion] = elemento;
            estuvoDisponible = true;
        }        
        return estuvoDisponible;
    }
    
    public T[] devuelveAlmacenados(){
        return vector;
    }
    
    public T devuelvePrimero() {
        int i = 0;
        T auxiliar = null;
        while (i < vector.length && auxiliar == null) {
            auxiliar = vector[i];
            i++;
        }
        return auxiliar;
    }
    
    public T DevuelveUltimoExistente() {
        int i = vector.length - 1;
        T auxiliar = null;
        while (i >= 0 && auxiliar == null) {
            auxiliar = vector[i];
            i--;
        }
        return auxiliar;
    }
    
    @Override
    public String toString() {        
        String auxiliar = "";
        for (int i = 0; i < vector.length; i++) {
            T elemento = vector[i];
            if (elemento != null) {
                auxiliar = auxiliar + elemento.toString() + "\n";
            }
        }
        return auxiliar;
    }

//    private final ArrayList<T> vector = new ArrayList<>(100);   
//    
//    public boolean almacenarUltimoDisponible(T elemento){
//        System.out.println(vector.size());
//        return vector.add(elemento);
//    }
//    
//    public void almacenarEnPosicion(int posicion, T elemento){
//        System.out.println(vector.size());
//        vector.add(posicion, elemento);
//    }
//    
//    public ArrayList<T> devuelveAlmacenados(){
//        return vector;                
//    }
//    
//    public T devuelvePrimero(){
//        int i = 0;
//        T auxiliar = null;
//        while(i<vector.size() && auxiliar == null){
//            auxiliar = vector.get(i);
//            i++;
//        }
//        return auxiliar;
//    }    
//    
//    
//    public T DevuelveUltimoExistente(){
//        int i = vector.size() - 1;
//        T auxiliar = null;
//        while(i>=0 && auxiliar == null){
//            auxiliar = vector.get(i);
//            i--;
//        }
//        return auxiliar;
//    }       
//    

}
