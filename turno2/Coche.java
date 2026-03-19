/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turno2;

/**
 *
 * @author Victor
 */
public class Coche extends Vehiculo {
    
    int num_puertas;
    int num_asientos;
    String bastidor;
    
    protected String color;
    
    public Coche (String marca, String modelo,int numPuertas, int numAsientos, String bastidor){
        super(modelo,marca);
        this.bastidor = bastidor;
        this.num_puertas = numPuertas;
        this.num_asientos = numAsientos;
        //super.modelo_private = modelo;
        //super.marca_protected = marca;
        //super(modelo,marca);    
    } 

    public Coche (String bastidor){
         //super();
         
         this.bastidor = bastidor;
    }
    
    public Coche (String marca, String modelo){
        super(modelo,marca);
        //super.marca_protected = marca;
        //super.modelo_private = modelo;
    } 

    
    @Override
    protected void arrancar(){
        System.out.println("Arranco un Coche");
    }
    
    
    public void metodo_de_Coche(){
        System.out.println("Método púplico de Coche");
    }
    
}
