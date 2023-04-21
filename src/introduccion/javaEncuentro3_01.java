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
public class javaEncuentro3_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        double num = leer.nextInt();
        if(num % 2 == 0){
            System.out.println("el numero ingresado es par");
        } else {
                System.out.println("el numero ingresado es impar");
        }
    }
    
}
