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
public class java01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un frase");
        String frase = leer.next();
        
        String retorno = vocales(frase);
        System.out.println(retorno);

       
        }
    public static String vocales(String frase){ 
        String newFrase = "";
        String letra = "";
	for(int i = 0;i<frase.length();i++){
            letra = frase.substring(i,i+1);
            switch(letra){
                case "a":
                    newFrase = newFrase.concat("@");
                   break;
                case "e":
                     newFrase = newFrase.concat("#");
                    break;
                case "i":
                     newFrase = newFrase.concat("$");
                    break;
                case "o":
                     newFrase = newFrase.concat("%");
                    break;
                case "u":
                     newFrase = newFrase.concat("*");
                    break;
                default:
                     newFrase = newFrase.concat(letra);
                    break;
            }
        }
            return newFrase;
   }
}
     
             



