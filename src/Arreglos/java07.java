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
public class java07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamanio de matriz");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int []vector = new int[8];
        int sumaF;
        int sumaC;
        int x = n;
        int diagonal = 0;
        int diagonal2 = 0;
        int y = n*2;
        
        //LLENANDO MATRIZ
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  System.out.println("ingresar valor");
                  matriz[i][j]= leer.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sumaF = 0;
            sumaC = 0;
            //SUMA DE DIAGONALES
            diagonal = diagonal + matriz[i][i];
            diagonal2 = diagonal2 + matriz[i][matriz.length - i - 1];
            
            for (int j = 0; j < n; j++) {
                //SUMA DE FILAS Y COLUMNAS
               sumaF = sumaF + matriz[i][j];
               sumaC = sumaC + matriz [j][i];
               
               //GUARDANDO VALORES DE FILAS Y COLUMNAS EN EL VECTOR
               if(j == n-1){
                   vector[i]= sumaF;
                   vector[x]= sumaC;
               } 
            }
            x++;
        }
        //GUARDANDO SUMA DE DIAGONALES
        vector[y]= diagonal;
        y++;
        vector[y]= diagonal2;
        
        //MOSTRAR VECTOR
        for(int i = 0; i < vector.length;i++){
            System.out.print("["+vector[i]+"]");
        }
        
        System.out.println("");
        
        
    // Imprimir el cuadrado mágico
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    //inicia la funcion de si el vector llenado tiene todo los valores iguales
    boolean magico = todosIguales(vector);
    
    //COMPROBANDO SI ES MAGICO O NO
    if(magico == true){
        System.out.println("es un cuadrado magico");
    }else {
        System.out.println("NO es un cuadrado magico");
    }
    }
    
    //FUNCION
    public static boolean todosIguales(int[] vector) {
    for (int i = 1; i < vector.length; i++) {
        if (vector[i] != vector[0]) {
            return false;
        }
    }
    return true;
}
}
