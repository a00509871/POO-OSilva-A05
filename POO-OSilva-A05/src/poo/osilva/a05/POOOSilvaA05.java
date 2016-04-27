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
public class POOOSilvaA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector100<Persona> vectorPersonas = new Vector100<>();
        Vector100<String> vectorString = new Vector100<>();
        Vector100<Integer> vectorInteger = new Vector100<>();
        Vector100<Float> vectorFloat = new Vector100<>();
        System.out.println("============Personas============");
        System.out.println("Se intenta agregar Anita en ultima posicion disponible:");
        System.out.println(vectorPersonas.almacenarUltimoDisponible(new Persona("Anita", 20, "Mujer")));
        System.out.println("Se intenta agregar Carlos en posicion 2:");
        System.out.println(vectorPersonas.almacenarEnPosicion(2, new Persona("Carlos2", 22,"Hombre")));
        System.out.println("Se intenta agregar Carlos2 en posicion 2:");
        System.out.println(vectorPersonas.almacenarEnPosicion(2, new Persona("Carlos", 22,"Hombre")));
        System.out.println("Se intenta agregar Daniel en posicion 99:");
        System.out.println(vectorPersonas.almacenarEnPosicion(99, new Persona("Daniel", 32,"Hombre")));
        System.out.println("Se intenta agregar Baldomero en ultima posicion Disponible:");
        System.out.println(vectorPersonas.almacenarUltimoDisponible(new Persona("Baldomero", 34, "Hombre")));        
        System.out.println("El primero en el vector es:");
        System.out.println(vectorPersonas.devuelvePrimero());        
        System.out.println("El ultimo en el vector es:");
        System.out.println(vectorPersonas.DevuelveUltimoExistente());        
        System.out.println("\n============Personas============\n");
        System.out.println(vectorPersonas.toString());
        
        // Se hace con String
        System.out.println("============String============");
        System.out.println("Se intenta agregar 'PRIMERO' en ultima posicion disponible:");
        System.out.println(vectorString.almacenarUltimoDisponible("PRIMERO"));
        System.out.println("Se intenta agregar 'TERCERO' en posicion 2:");
        System.out.println(vectorString.almacenarEnPosicion(2, "TERCERO"));
        System.out.println("Se intenta agregar 'TERCERO2' en posicion 2:");
        System.out.println(vectorString.almacenarEnPosicion(2, "TERCERO2"));
        System.out.println("Se intenta agregar 'CUARTO' en posicion 99:");
        System.out.println(vectorString.almacenarEnPosicion(99, "CUARTO"));
        System.out.println("Se intenta agregar 'SEGUNDO' en ultima posicion Disponible:");
        System.out.println(vectorString.almacenarUltimoDisponible("SEGUNDO"));        
        System.out.println("El primero en el vector es:");
        System.out.println(vectorString.devuelvePrimero());        
        System.out.println("El ultimo en el vector es:");
        System.out.println(vectorString.DevuelveUltimoExistente());        
        System.out.println("\n============String============\n");
        System.out.println(vectorString.toString());
        
        // Se hace con Integer
        
        System.out.println("============Float============");
        System.out.println("Se intenta agregar '1.1' en ultima posicion disponible:");
        System.out.println(vectorFloat.almacenarUltimoDisponible(Float.parseFloat("1.1")));
        System.out.println("Se intenta agregar '3.1' en posicion 2:");
        System.out.println(vectorFloat.almacenarEnPosicion(2, Float.parseFloat("3.1")));
        System.out.println("Se intenta agregar '3.2' en posicion 2:");
        System.out.println(vectorFloat.almacenarEnPosicion(2, Float.parseFloat("3.2")));
        System.out.println("Se intenta agregar '4.1' en posicion 99:");
        System.out.println(vectorFloat.almacenarEnPosicion(99, Float.parseFloat("4.1")));
        System.out.println("Se intenta agregar '2.1' en ultima posicion Disponible:");
        System.out.println(vectorFloat.almacenarUltimoDisponible(Float.parseFloat("2.1")));
        System.out.println("El primero en el vector es:");
        System.out.println(vectorFloat.devuelvePrimero());        
        System.out.println("El ultimo en el vector es:");
        System.out.println(vectorFloat.DevuelveUltimoExistente());        
        System.out.println("\n============Float============\n");
        System.out.println(vectorFloat.toString());
        
        // Se hace con Integer
        
        System.out.println("============Integer============");
        System.out.println("Se intenta agregar '1' en ultima posicion disponible:");
        System.out.println(vectorInteger.almacenarUltimoDisponible(1));
        System.out.println("Se intenta agregar '3' en posicion 2:");
        System.out.println(vectorInteger.almacenarEnPosicion(2, 3));
        System.out.println("Se intenta agregar '32' en posicion 2:");
        System.out.println(vectorInteger.almacenarEnPosicion(2, 32));
        System.out.println("Se intenta agregar '4' en posicion 99:");
        System.out.println(vectorInteger.almacenarEnPosicion(99, 4));
        System.out.println("Se intenta agregar '2' en ultima posicion Disponible:");
        System.out.println(vectorInteger.almacenarUltimoDisponible(2));        
        System.out.println("El primero en el vector es:");
        System.out.println(vectorInteger.devuelvePrimero());        
        System.out.println("El ultimo en el vector es:");
        System.out.println(vectorInteger.DevuelveUltimoExistente());        
        System.out.println("\n============Integer============\n");
        System.out.println(vectorInteger.toString());
        
    }

}
