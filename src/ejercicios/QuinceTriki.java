/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author angela
 */
public class QuinceTriki {
     public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         String[][] triki= new String [3][3]; 

            for (int i = 0; i < triki.length; i++) {
             for (int j = 0; j < triki[i].length; j++) {
                
               System.out.print("Introduzca la posición fila: ");
                int fila = entrada.nextInt();
                 if (fila == 8) {
                     System.out.println("Este programa ha terminado.");
                     System.exit(0);
                 } 
                         
               System.out.print("Introduzca la posición columna: ");
                int columna = entrada.nextInt();
                
                System.out.print("Introduzca x or o (" + fila + "," + columna + "): ");
                triki[fila][columna] = entrada.next();
               System.out.println("TRiki 3x3:");
                 for (String[] triki1 : triki) {
                   for (String triki11 : triki1) {
                       System.out.print(triki11 + " ");
                   }
                     System.out.println();
                 }
             }
            }
      
   }

}       
