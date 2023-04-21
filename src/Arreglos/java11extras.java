/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
        
public class java11extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String [] vector = new String[10];
        int [][] matriz = new int[4][10];
        rellenarV(vector);
        rellenarNotas(matriz);
        
    }
    public static String [] rellenarV(String vector []){
       
        for (int i = 0; i < vector.length; i++) {
            vector[i]= "alumno "+i+1;
        }
        return vector;
    }
    public static int [][] rellenarNotas(int matriz [][]){
       Random ramd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]= ramd.nextInt(10);
            }
        }
        return matriz;
    }
}
