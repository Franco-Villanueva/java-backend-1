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
public class javaEncuentro3_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un palabra");
        String palabra = leer.nextLine();
        String letra = palabra.substring(0,1);
        if(letra.equals("a")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
