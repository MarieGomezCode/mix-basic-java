/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class CatorceFactorial {
        public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int numFac = 1;
            System.out.println(i);

            for (int j = 1; j <= i; j++) {
                numFac = numFac *  j;
            }

            System.out.println("El factorial de " + i + " es: " + numFac);
        }
    }
}
