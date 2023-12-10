/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class SieteTrianguloAsteriscos {
        public static void main(String[] args) {

        
        int altura = 7;

       
        for (int repetirAltura = 1; repetirAltura <= altura; repetirAltura++) {
            
            for (int fila = 1; fila <=  repetirAltura; fila++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
