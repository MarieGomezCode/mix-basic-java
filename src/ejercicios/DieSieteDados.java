/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angela
 */
public class DieSieteDados {
       public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);

       
        int numeroDado;
         String responde;
       
        do {

           
            numeroDado = new Random().nextInt(6) + 1;

        
            System.out.println("El número del dado es: " + numeroDado);

           
            System.out.println("¿Desea volver a lanzar el dado? (siu/no)");

           
             responde = entrada.nextLine();

        } while (responde.equals("siu"));

        System.out.println("Gracias por jugar!");
    }
}
