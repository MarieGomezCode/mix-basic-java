/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class TresForAnidado {
        public static void main(String[] args) {
        for (int multiplica = 1; multiplica <= 10; multiplica++) {
            System.out.println("Tabla del " + multiplica + ":");
            System.out.println("----------------");
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(multiplica + " x " + multiplicador + " = " + (multiplica * multiplicador));
            }
            System.out.println(); 
        }
    }

}


