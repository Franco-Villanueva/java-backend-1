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
public class java03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int contadorIn = 0;
        String palabra;
        do{
            System.out.println("ingrese palabra");
            palabra = leer.nextLine();
            if(!palabra.equalsIgnoreCase("&&&&&")){
                
            if(palabra.length()== 5 && 
               palabra.substring(0,1).equalsIgnoreCase("x") && 
               palabra.substring(4,5).equalsIgnoreCase("o")){
                contador ++;
            }else {
                contadorIn++;
            }
            }
        }while(!palabra.equalsIgnoreCase("&&&&&"));
        System.out.println("palabra correctas ingresadas "+ contador);
        System.out.println("palabra incorrectas ingresadas "+ contadorIn);
    }
    
}
