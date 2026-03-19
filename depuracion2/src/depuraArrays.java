/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author losad
 */
public class depuraArrays {
    
    public static void main(String[] args) {
        int [] miArray1 = new int [3];
        int [] miArray2 = {1,2,3};
        for (int i = 0; i < miArray1.length; i++) {
            miArray1 [i] = i;
        }
        for (int i = 0; i < miArray2.length; i++) {
            miArray2 [i] = 2 * miArray2[i];
        }
        
        miArray1 = miArray2;
        miArray1[0] = -1;
        miArray1[1] = -1;
        miArray1[2] = -1;
        
    }
    
}
