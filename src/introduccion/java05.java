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
public class java05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar un numero");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num *3;
        double raiz = Math.sqrt(num);
        System.out.println("el doble del numero es: "+ doble);
        System.out.println("el triple del numero es: "+triple);
        System.out.println("la raiz cuadrada del numero es: "+raiz);
    }
    
}
