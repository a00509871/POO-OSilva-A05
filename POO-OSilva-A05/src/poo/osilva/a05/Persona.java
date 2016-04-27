/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.osilva.a05;

/**
 *
 * @author A00509871
 */
public class Persona {
    
    // Atributos
    private String nombre;
    private int edad;
    private String sexo;
    
    
    public Persona (String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return nombre + " / " + edad + " / " + sexo;
    }

}
