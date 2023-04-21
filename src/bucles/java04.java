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
public class java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        for(int i = 0; i<num;i++){
            
            for(int x = 0; x<num; x++){
                
                if(i==0 || x==0 || i == num-1 || x==num-1){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
    
}
