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
public class java06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                System.out.println("ingresar num");
                matriz[i][j]= leer.nextInt();
            }
        }
        boolean anti =comparacion(matriz);
        if(anti == true){
            System.out.println("es antisimetrica");
        }else {
            System.out.println("no es antisimetrica");
        }
    }
        public static boolean comparacion(int[][] matriz){
            
        for( int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j] != (-matriz[j][i])){
                   
                   return false;
                }
            }
        }
        return true;
            
    }
    
}
