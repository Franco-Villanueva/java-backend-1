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
public class java03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamanio del vector");
        int [] arreglo = new int[leer.nextInt()];
        
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i]= (int)(Math.random()*10);
        }
        
        System.out.println("ingresar numero a buscar");
        int buscador = leer.nextInt();
        
         for(int i = 0; i < arreglo.length; i++){
            if(buscador == arreglo[i]){
                System.out.println("el arreglo es igual en la posicion "+i);
            }
        }
    }
    
}
