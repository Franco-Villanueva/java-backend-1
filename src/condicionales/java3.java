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
public class java3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        String palabra = leer.nextLine();
        
        if(palabra.length()== 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
