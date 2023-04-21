/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

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
        int [][] matriz = new int[4][4];
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j<4; j++){
                
                int aleatorio = (int) (Math.random() * 99);
                matriz[i][j]= aleatorio;
            }
        }
        System.out.println("matriz A");
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j<4; j++){
                
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("matriz B");
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j<4; j++){
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println("");
        }
    }
    
}
