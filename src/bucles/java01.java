/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

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
        System.out.println("ingrese un numero limite");
        int numLimite = leer.nextInt();
        int num;
        int suma = 0;
        while(suma <= numLimite){
            
            System.out.println("ingresar numero");
            num = leer.nextInt();
            suma = suma + num;
            
        }
        System.out.println("Superaste el limite");
    }
    
}
