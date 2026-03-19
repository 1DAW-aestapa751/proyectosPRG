/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turno2;

import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class PruebaVecina {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("Camión", "Pegasus");
        Coche c1 = new Coche("Renault","5");
        Vehiculo c2 = new Coche("Audi","A3");
        Moto m1 = new Moto("Honda","H1");
        
        String s = "Hola";
        
        Vehiculo [] corredores = {v1,c1,c2,m1};
        
        Integer [] nums = {7,5,6};
        String [] palabras = {"Hola", "Adios"};
        
        pintarArray(palabras);
        pintarArray(nums);
        pintarArray(corredores);
        
        lanzar_carrera(corredores);
        
    }
    
    public static void pintarArray(Object [] miArray){
        System.out.println(Arrays.toString(miArray));
    }
    
    public static void lanzar_carrera(Vehiculo [] participantes){
        
        //System.out.println(Arrays.toString(participantes));
        
        
        
        for (Vehiculo v: participantes){
            v.arrancar();
            System.out.println("El vehículo arrancado es " + v.toString());
        } 
        
    }
    
}
