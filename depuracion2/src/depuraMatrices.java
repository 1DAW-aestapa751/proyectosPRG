
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author losad
 */
public class depuraMatrices {
    
    public static void main(String[] parametros) {
        int m [] [] = {{1,2},{3,4},{5,6}};
        m = func1 (m);
        func2(m);
    }
    
   public static int[][] func1 (int m [] []){
       int [][] matriz = new int [3][2];
       int i=0;
       for (int [] v: m) {
           int j=0;
            for (int num: v){
                matriz[i][j]=2*num;
                j++;
            }
            i++;
        }
       return matriz;
   }
    
   public static void func2 (int matriz [] []){
       for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j< matriz.length;j++){
                matriz [i][j] = matriz [i][j] * matriz [i][j];
            }
        }
   }
}
