/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEnlazadas;

/**
 *
 * @author losad
 */
public class Cantante {
    
    private int edad;
    private String nombre;
    private Cantante cantanteFavorito;
    private Cantante [] companeros;

    public Cantante(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Cantante(String nombre) {
        this(18,nombre);
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cantante getCantanteFavorito() {
        return cantanteFavorito;
    }

    public void setCantanteFavorito(Cantante cantanteFavorito) {
        this.cantanteFavorito = cantanteFavorito;
    }

    public Cantante[] getCompaneros() {
        return companeros;
    }

    public void setCompaneros(Cantante[] companeros) {
        this.companeros = companeros;
    }
    
    
    
}
