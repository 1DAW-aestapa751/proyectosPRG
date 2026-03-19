/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turno2;

import java.util.Objects;

/**
 *
 * @author Victor
 */
public class Vehiculo {
 
    protected String modelo_private;
    protected String  marca_protected;
    public String atributo_public;
    String matricula_vecina;
    
    public Vehiculo (){
        this("","");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo_private=" + modelo_private + ", marca_protected=" + marca_protected + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Vehiculo other = (Vehiculo) obj;
        return  this.matricula_vecina.equals(other.matricula_vecina) ;
    }
    
    
    
    public Vehiculo (String marca, String modelo){
        this.marca_protected = marca;
        this.modelo_private = modelo;
    } 
    
    protected String color;
    
    
    
    protected void arrancar(){
        
        System.out.println("Arranco un Vehículo");
    }
    
    public void metodo_publico(){
        System.out.println("Método púplico de Vehículo");
    }
    
    private void metodo_private(){
        System.out.println("Método private de Vehículo");
    }
    
    protected void metodo_protected(){
        System.out.println("Método protected de Vehículo");
    }
    
    void metodo_visibilidadVecina(){
        System.out.println("Método de paquete de Vehículo");
    }
    
    
    
}
