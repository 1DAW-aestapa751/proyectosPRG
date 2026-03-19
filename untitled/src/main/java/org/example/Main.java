package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("prueba de java en IntelliJ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] num2 = new int[5][5];
        for (int i = 0; i<num2.length; i++){
            for (int j = 0; j<num2[i].length; j++){
                num2[i][j] = j+1;
            }
        }
        for (int i = 0; i<num2.length; i++){
            for (int j = 0; j<num2[i].length; j++){
                System.out.print(num2[i][j]);
            }
            System.out.println();
        }
    }
}