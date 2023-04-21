/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        boolean resultado = esPrimo(num);
        if(resultado == true){
            System.out.println("el numero ingresado es primo");
        }else if (resultado == false){
            System.out.println("el numero ingresado NO es primo");
        }
        

    }
    public static boolean esPrimo(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }   
            }
        return true;
    }
}
