/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turno2.externa;

import turno2.Vehiculo;

/**
 *
 * @author Victor
 */
public class CocheExterno extends Vehiculo {
    
    int num_puertas;
    int num_asientos;
    String bastidor;
    
    //protected String color;
    
    protected void arrancar(){
        System.out.println("Arranco un Vehículo");
    }
    
    public void metodo_de_Coche(){
        System.out.println("Método púplico de Coche");
    }
    
}

