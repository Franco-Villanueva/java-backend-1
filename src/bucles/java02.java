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
public class java02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        double num = leer.nextDouble();
        System.out.println("ingrese el segundo numero");
        double num1 = leer.nextDouble();
        String salir = "";
        int opcion;
        do{
        System.out.println("MENU");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.salir");
        System.out.println("elija una opcion");
        opcion = leer.nextInt();
        if(opcion != 5){
         switch(opcion){
             case 1:
                double suma = num + num1;
                System.out.println("la suma es: "+suma);
                break;
             case 2:
                double resta = num - num1;
                System.out.println("la resta es: "+resta);
                break;
             case 3:
                double multi = num * num1;
                System.out.println("la multiplicacion es: "+multi);
                break;
             case 4:
                double div = num / num1;
                System.out.println("la divison es: "+div);
                break;
             default:
                System.out.println("no elegiste ninguna opcion");
                break;
         }
        }else {
            System.out.println("seguro que desea salir s/n");
            salir = leer.next();
            
        }
        
    }while(!salir.equalsIgnoreCase("s"));
    }
}
    

