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
public class java01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese el primer numero  ");
        num1=leer.nextInt();
        System.out.println("ingrese otro numer");
        num2=leer.nextInt ();
        if(num1>25 && num2>25){
            System.out.println("los dos numeros ingresados son mayor que 25");
        }else if(num1>25 || num2>25){
            System.out.println("al menos uno de los dos numeros es mayor a 25");
        }else {
            System.out.println("ningun numero ingresado es mayor a 25");
        }
    }
    
}
