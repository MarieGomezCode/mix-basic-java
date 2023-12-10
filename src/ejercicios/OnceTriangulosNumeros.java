/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class OnceTriangulosNumeros {
        public static void main(String[] args) {

       
        int lado = 10;

       
        for (int horizontal = 1; horizontal <= lado; horizontal++) {
            for (int verti = 1; verti <= horizontal; verti++) {
                System.out.print(verti);
            }
            System.out.println();
        }
    }
}
