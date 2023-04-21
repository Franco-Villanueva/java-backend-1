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
public class java03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima
        los datos de las personas ingresadas por teclado e indique si son 
        mayores o menores de edad. Después de cada persona, el programa debe 
        preguntarle al usuario si quiere seguir mostrando personas y frenar 
        cuando el usuario ingrese la palabra “No”.*/
        Scanner leer = new Scanner(System.in);
        String continuar = "";
        while (!continuar.equalsIgnoreCase("NO")){
            
            System.out.println("ingresar nombre");
            String nombre = leer.next();
            System.out.println("ingresar edad");
            int edad = leer.nextInt();
            
            String retorno = esMayorDeEdad(nombre, edad);
            System.out.println(retorno);
            
            System.out.println("desea seguir escribiendo personas (si/no)");
            continuar = leer.next();
        }
            
        }
        public static String esMayorDeEdad(String nombre, int edad) {
        if (edad >= 18) {
            return nombre + " es mayor de edad.";
        } else {
            return nombre + " es menor de edad.";
        }
    }
    }
    

