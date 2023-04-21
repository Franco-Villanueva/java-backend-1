/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subprogramas;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class java02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();
        
      
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("elija una opcion");
        int opcion = leer.nextInt();
        
        if(opcion>0 && opcion<5){
            
        int retorno = calculadora(num1,num2,opcion);
        System.out.println("resultado "+retorno);
        
        }else {
            System.out.println("no elegiste ninguna opcion");
        }
    }
    public static int calculadora(int num1, int num2, int opcion){
        switch(opcion){
             case 1:
                return num1 + num2;
             
             case 2:
                return num1 - num2;
                
             case 3:
                return num1 * num2;

             case 4:
                return num1 / num2;
             default:
                 return 0;
        }
    }
}
