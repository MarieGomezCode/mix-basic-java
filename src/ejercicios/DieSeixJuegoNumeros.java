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
public class DieSeixJuegoNumeros {
     public static void main(String[] args) {
        int vidas = 2;
        int puntos = 0;
        Scanner entrada = new Scanner(System.in);

        
        while (vidas > 0) {
           
            int numero = (int) (Math.random() * 10);

           
            if (numero == 0) {
                vidas=vidas-1;
            } else {
                puntos= puntos + 1 ;
            }

            
            System.out.println("Número aleatorio: " + numero);
            System.out.println("Vidas restantes: " + vidas);
            System.out.println("Puntos obtenidos: " + puntos);

            System.out.print("Presiona Enter para continuar...");
            entrada.nextLine();
        }

       
        System.out.println("¡Juego terminado!");
        System.out.println("Puntos obtenidos: " + puntos);
         System.out.println("Te quedo esto de vidas: "+vidas);

       
    }
}
