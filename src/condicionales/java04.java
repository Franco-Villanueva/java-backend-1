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
public class java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int suma = 0;
        int contador = 0;
        do{
         contador ++;
         System.out.println("ingrese un numero");
         num = leer.nextInt();
                if(num>0){
                    suma = suma + num;
                } else if (contador == 20){
                    break;
                }
               
        }while(num != 0);
        if(num == 0){
            System.out.println("encontraste el 0");
    } else{
            System.out.println("la suma de los 20 numeros es: "+ suma);
}
    }
    
}
