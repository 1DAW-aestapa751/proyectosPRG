/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comparableYcomparator;

//import com.mycompany.test_herenciapolimorfismo.Automovil;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author losad
 */
public class PruebaComparadores {
    public static void main(String[] args) {
        
        System.out.println("Prueba Comparadores");
        String [] numeros = new String[3];
        numeros[0]= "Cinco";
        numeros[1]= "Uno";
        numeros[2]= "Ocho";
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
//        Coche c1 = new Coche("R5", 1985);
//        Coche c2 = new Coche ("Pasat", 2012);
//        Coche c3 = new Coche ("Mercedes" ,1990);
//        System.out.println("El resultado es " + c1.compareTo(c3));    
//        System.out.println("El resultado es " + c3.compareTo(c1));  
//        
       Coche misCoches [] = new Coche [3];
        //Inserto 3 coches en el array y le cambio las matrículas 
        (misCoches[0] = new Coche("Mercedes",1985)).setMatricula("1111 BBB");
        (misCoches[1] = new Coche("Audi", 2022)).setMatricula("2222 BBB");
        (misCoches[2] = new Coche("Renault", 2020)).setMatricula("0111 CCC");
        
        Arrays.sort(misCoches);
        
        System.out.println("Prueba 0: Orden natural " + Arrays.toString(misCoches));
        
        ComparadorMarca criterioPorMarca = new ComparadorMarca();
        
        //Arrays.sort(misCoches, criterioPorMarca);
        
        Arrays.sort(misCoches,new ComparadorMarca());

        System.out.println("Prueba 1: Ordenado Por Marca" + Arrays.toString(misCoches));
        
        Comparator comp = new ComparadorMarca();
        
        Arrays.sort(misCoches,comp.reversed());
        
        System.out.println("Prueba 2: Ordenado Por Marca descendente" + Arrays.toString(misCoches));
        
        
        Arrays.sort(misCoches,  new Comparator() {
            
            public int compare(Object o1, Object o2) {
                Coche c1 = (Coche) o1;
                Coche c2 = (Coche) o2;
                return c1.getMatricula().compareTo(c2.getMatricula());
            }
        }
        
        );
        
        System.out.println("Prueba 3: Por matrícula" + Arrays.toString(misCoches));
        
        
    }
}
