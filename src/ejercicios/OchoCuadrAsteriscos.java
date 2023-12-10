/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class OchoCuadrAsteriscos {
        public static void main(String[] args) {
        int Dimenlado = 8; 

        
        for (int fila = 0; fila < Dimenlado; fila++) {
            
            for (int columna = 0; columna <= Dimenlado; columna++) {
                System.out.print(" * "); 
            }
            System.out.println();
        }
    }
}
