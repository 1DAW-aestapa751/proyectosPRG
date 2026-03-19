/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turno2;

/**
 *
 * @author Victor
 */
public class Moto extends Vehiculo {
    
    int num_ruedas;
    //int num_asientos;
    boolean isElectrycal;
    
//    protected void arrancar(){
//        System.out.println("Arranco una Vehículo");
//    }

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    
    
    public void metodo_de_Moto(){
        System.out.println("Método púplico de Coche");
    }
    
    
}
