/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class javaEncuentro3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        String palabra = leer.nextLine();
        
        if (palabra.length() == 8){
            System.out.println("correcto");
        }else {
            System.out.println("incorrecto");
        }
        
    }
    
}
