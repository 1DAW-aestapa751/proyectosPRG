
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
    
    public static void main(String[] args) {
        int m [][] = {{1,2},{3,4},{5,6}};
        m = func1 (m);
        func2(m);
        pintarMatriz(m);
    }

    public static int[][] func1(int[][] m) {
        if (m.length == 0) return new int[0][0];
        int[][] matriz = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                matriz[i][j] = m[i][j] * 2;
            }
        }
        return matriz;
    }
    
   public static void func2 (int matriz [][]){
       for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j< matriz[i].length;j++){
                matriz [i][j] = matriz [i][j] * matriz [i][j];
            }
        }
   }
    public static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
