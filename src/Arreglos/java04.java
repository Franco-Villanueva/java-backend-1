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
public class java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Recorrer un vector de N enteros contabilizando cuántos números
        //son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
         Scanner leer = new Scanner(System.in);
         int contador = 0;
         int contador2 = 0;
         int contador3 = 0;
         int contador4 = 0;
         int contador5 = 0;
        System.out.println("ingrese tamanio del vector");
        int [] arreglo = new int[leer.nextInt()];
        for(int i =0; i < arreglo.length; i++){
        int aleatorio = (int) (Math.random() * 999999) ;
        //0,1 * 999,999 = 99,999
        arreglo[i]= aleatorio;
        if(arreglo[i]<10){
           contador++;
        }
         if(arreglo[i]>99 && arreglo[i]<1000){
           contador2++;
        }
          if(arreglo[i]>999 && arreglo[i]<10000){
           contador3++;
        }
           if(arreglo[i]>9999 && arreglo[i]<100000){
           contador4++;
        }
            if(arreglo[i]>99999){
           contador5++;
        }
        }
        System.out.println("num de 1cifra "+contador);
        System.out.println("num de 2cifras "+contador2);
        System.out.println("num de 3cifras "+contador3);
        System.out.println("num de 4cifras "+contador4);
        System.out.println("num de 5cifras "+contador5);
    }
    
}
