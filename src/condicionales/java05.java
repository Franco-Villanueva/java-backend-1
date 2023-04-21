/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        e imprima el número ingresado seguido de tantos asteriscos como indique
        su valor. Por ejemplo:
         5 *****
         3 ***
         11 ***********
         2 **
        */
        Scanner leer = new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.println("ingresar 4 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        if(num1>0 && num1<21 && num2>0 && num2<21 && num3>0 && num3<21 && num4>0 && num4<21){
        for(int i = 0; i<num1+1;i++){
            if(i==0){
                System.out.print(num1);
            }else{
               System.out.print("*");
            }
        }
        System.out.println("");
        for(int i = 0; i<num2+1;i++){
            if(i==0){
                System.out.print(num2);
            }else{
               System.out.print("*");
            }
            
        }
        System.out.println("");
        for(int i = 0; i<num3+1;i++){
            if(i==0){
                System.out.print(num3);
            }else{
               System.out.print("*");
            }
            
        }
        System.out.println("");
        for(int i = 0; i<num4+1;i++){
            if(i==0){
                System.out.print(num4);
            }else{
               System.out.print("*");
            }
            
        }
           System.out.println("");
        }else {
            System.out.println("uno de los numeros no esta comprendido entre 1 y 20");
        }
    }
    
}
