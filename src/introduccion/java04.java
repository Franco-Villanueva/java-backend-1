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
public class java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar cantidad de grados");
        int num = leer.nextInt();
        int newNum =(num * 9/5) + 32;
        System.out.println("la cantidad de grados Fahrenheit "+ newNum);
    }
    
}
