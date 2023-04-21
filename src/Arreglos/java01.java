/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         String [] arreglo = new String[5];
         
         for(int i = 0; i < 5; i++){
             System.out.println("ingrese el nombre");
             arreglo[i]= leer.next();
             
         }
         System.out.println("el arreglo contiene los siguentes nombres");
         for(int i = 0; i < 5;i++){
         System.out.println(arreglo[i]);
         }
    }
    
}
