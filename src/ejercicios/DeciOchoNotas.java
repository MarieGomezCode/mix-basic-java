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
public class DeciOchoNotas {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       
        double[] notas = new double[3];

      
        int i = 0;
        while (i < notas.length) {
            System.out.print("Ingresa la nota " + (i+1) + ": ");
            notas[i] = entrada.nextDouble();
            i=i+1;
        }

        
        double suma = 0;
        for (int j = 0; j < notas.length; j++) {
            suma += notas[j];
        }
        double promedio = suma / notas.length;

      
        System.out.println("El promedio de las notas es: " + promedio);

        
    }
}
