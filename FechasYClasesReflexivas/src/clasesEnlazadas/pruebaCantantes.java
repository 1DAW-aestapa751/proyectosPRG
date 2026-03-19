/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEnlazadas;

/**
 *
 * @author losad
 */
public class pruebaCantantes {
    
    public static void main(String[] args) {
        Cantante c1 = new Cantante(29, "Maluma");
        Cantante c2 = new Cantante ("Bugs Bunny");
        
        c1.setCantanteFavorito(c2);
        c2.setCantanteFavorito(c1);
        
        
        System.out.println("El cantante favorito de " + c1.getNombre() + " es " + c1.getCantanteFavorito().getNombre());
        //c1.getCantanteFavorito().setNombre("El fary");
        //System.out.println("El cantante favorito de " + c2.getNombre() + " es " + c2.getCantanteFavorito().getNombre());
    }
}
