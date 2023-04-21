/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java09extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random ramd = new Random();
        System.out.println("ingrese tamanio de vectores");
        int [] vect1 = new int[leer.nextInt()];
        int [] vect2 = new int[vect1.length];
        for(int i = 0; i < vect1.length; i++){
           vect1[i]= ramd.nextInt(10);
           vect2[i]= ramd.nextInt(10);
            
        }
        for (int i = 0; i < vect1.length; i++) {
            if(vect1[i]==vect2[i]){
                System.out.println("son iguales en posicion "+i);
                break;
            }
        }
        
    }
    
}
