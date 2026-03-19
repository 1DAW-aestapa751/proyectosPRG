/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEnlazadas;



/**
 *
 * @author losad
 */
public class PruebaTrabajadores {
    
     public static void main(String[] args) {
        //Trabajador profesor1 = new Trabajador("Victor",15000);
        //Trabajador profesor2 = new Trabajador ("Eliseo",17000);
        //Trabajador director = new Trabajador ("Ismael",20000);
        
        Trabajador profesora = new Trabajador ("Pilar",20000);
        Trabajador profesor1 = new Trabajador("Victor",15000);
        Trabajador profesor2 = new Trabajador ("Jose",17000);
        
        
        
        System.out.println("**** Información inicial ****");
        
        System.out.println(profesor1.getNombre() + " es jefe: " + profesor1.isJefe());
        System.out.println(profesor2.getNombre() + " es jefe: " + profesor2.isJefe());
        System.out.println(profesora.getNombre() + " es jefe: " + profesora.isJefe());
        
        System.out.println(profesor1.obtenerDatosTrabajadores());
        System.out.println(profesor2.obtenerDatosTrabajadores());
        System.out.println(profesora.obtenerDatosTrabajadores());
        
        if (profesor1.getJefe()!=null) System.out.println("El jefe de " + profesor1.getNombre() + " es " + profesor1.getJefe().getNombre()); else System.out.println(profesor1.getNombre() + " no tiene jefe");
        if (profesor2.getJefe()!=null) System.out.println("El jefe de " + profesor2.getNombre() + " es " + profesor2.getJefe().getNombre()); else System.out.println(profesor2.getNombre() + " no tiene jefe");
        if (profesora.getJefe()!=null) System.out.println("El jefe de " + profesora.getNombre() + " es " + profesora.getJefe().getNombre()); else System.out.println(profesora.getNombre() + " no tiene jefe");
       
        
        System.out.println("**** Asigno el equipo de trabajo al jefeDeDepartamento ****\n");
        Trabajador [] profesores = {profesor1,profesor2};
        profesora.asignarEquipoDeTrabajo(profesores);
        
        System.out.println("**** Información Final ****");
        
        System.out.println(profesor1.getNombre() + " es jefe: " + profesor1.isJefe());
        System.out.println(profesor2.getNombre() + " es jefe: " + profesor2.isJefe());
        System.out.println(profesora.getNombre() + " es jefe: " + profesora.isJefe());
        
        System.out.println(profesor1.obtenerDatosTrabajadores());
        System.out.println(profesor2.obtenerDatosTrabajadores());
        System.out.println(profesora.obtenerDatosTrabajadores());
        
        if (profesor1.getJefe()!=null) System.out.println("El jefe de " + profesor1.getNombre() + " es " + profesor1.getJefe().getNombre()); else System.out.println(profesor1.getNombre() + " no tiene jefe");
        if (profesor2.getJefe()!=null) System.out.println("El jefe de " + profesor2.getNombre() + " es " + profesor2.getJefe().getNombre()); else System.out.println(profesor2.getNombre() + " no tiene jefe");
        if (profesora.getJefe()!=null) System.out.println("El jefe de " + profesora.getNombre() + " es " + profesora.getJefe().getNombre()); else System.out.println(profesora.getNombre() + " no tiene jefe");
        
     }
}
