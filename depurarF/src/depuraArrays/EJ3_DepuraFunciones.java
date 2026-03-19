/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package depuraArrays;

/**
 *
 * @author losad
 */
public class EJ3_DepuraFunciones {
 
    public static void main(String[] parametros) {
         int i=0;
         while(i<100) {
            if(i%2==0) {
                if (i> 50){
                   funcion1(i);
                }else{
                   funcion2(i);
                }
            } else {
                if (i < 50){
                   funcion1(i);
                }else{
                   funcion3(i);
                }
            }
            i++;
         }
    }

    private static void funcion1(int i) {
       escribirNumero("El valor de la función 1 para i=" + i + " es ", i);
    }

    private static void funcion2(int i) {
        escribirNumero("El valor de la función 2 para i=" + i + " es ", 2*i);
    }

    private static void funcion3(int i) {
        System.out.println("Soy impar mayor de 50 con valor i = "+ i +"y mi resultado es "+i*2);
    }

    private static void escribirNumero(String mensaje, int i) {
        System.out.println(mensaje + " " + i);
    }
    
}
