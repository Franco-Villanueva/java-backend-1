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
public class java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero de Euros");
        double num = leer.nextInt();
        System.out.println("ingrese a convertir (dolar, yenes, libras)");
        String moneda = leer.next();
        
        cambioMoneda(num,moneda);
    }
    public static void cambioMoneda(double num, String moneda){
        double resultado;
        if(moneda.equalsIgnoreCase("dolar")){
            resultado = num * 1.29;
            System.out.println("el cambio es: "+ resultado);
        }else if(moneda.equalsIgnoreCase("yenes")){
            resultado = num * 129.85;
            System.out.println("el cambio es: "+ resultado);
        }else if(moneda.equalsIgnoreCase("libras")){
           resultado = num * 0.86;
            System.out.println("el cambio es: "+ resultado);
        }
    }
}
