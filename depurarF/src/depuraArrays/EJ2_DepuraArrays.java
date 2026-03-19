/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package depuraArrays;

/**
 *
 * @author losad
 */
public class EJ2_DepuraArrays {

    public static void main(String[] args) {
        int [] a = {9,5,4,8,3};
        modificaArray(a);
    }
    
    public static void modificaArray(int A[]){                                            
        int i;
        int j;
        int aux;
        for (i = 1; i < A.length; i++){ 
                  aux = A[i];           
                  j = i - 1;            
                  while ((j >= 0) && (aux < A[j])){                                
                    A[j + 1] = A[j];   
                    j--;               
                  }
                  A[j + 1] = aux;       
        }
    }
    
}
