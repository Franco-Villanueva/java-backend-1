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
public class java08extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //public static <E> void imprimeMatriz(E[][] Matriz){
        //for(E[] element : Matriz){
         //   for(E elemento : element){
         //       System.out.print(elemento + " ");
         //   }
         //   System.out.println("");
        //}
   // }
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("ingrese tamanio de vector");
        int [] vector = new int[leer.nextInt()];
        
        for(int i = 0; i < vector.length; i++){
            System.out.println("ingresar numero");
            suma += leer.nextInt();
        }
        System.out.println("la suma de los numero ingresados es = "+suma);
    }
    
}
