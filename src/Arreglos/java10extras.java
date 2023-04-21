/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java10extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese tamanio de vector");
        int [] vector = new int [leer.nextInt()];
        rellenar(vector);
        imprimir(vector);
    }
    public static int [] rellenar(int vector []){
        Random ramd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i]= ramd.nextInt(10);
        }
        return vector;
    }
    public static void imprimir(int vector []){
        
        System.out.println(Arrays.toString(vector));
    }
}
