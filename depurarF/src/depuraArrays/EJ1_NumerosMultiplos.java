/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package depuraArrays;

/**
 *
 * @author losad
 */
public class EJ1_NumerosMultiplos {
    
    public static void main(String[] args) {
        long i, t_ini = 0, t_fin = 0, n = 0;
        double dif = 0;

        t_ini = System.currentTimeMillis();
        
        for (i = 1; i <= 1000; i++)
            if (i % 2 == 0 && i % 3 == 0 && i % 13 == 0 && i % 12 == 0)
                System.out.println(i);
                n++;
        
        t_fin = System.currentTimeMillis();
        dif = ((double) (t_fin - t_ini) / 1000);
        System.out.println(dif);
        
    }

    
    
}
