/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angela
 */
public class MatrizCarros {
    public static void main(String[] args) {
        
       String[][] carros =  {{"Masda", "Deportvo","XXX"},{"Ford", "Land Cruiser", "OOO"},{"Volsbaegn","Land Cruiser","XXX"}} ;

       
        for (int i = 0; i < carros.length; i++) {
            for (int j = 0; j < carros[i].length; j++) {
                 System.out.println("Carro "+" "+ j+" " + carros[i][j]); 
            }
        }
       
       
       
 
        
    }
}
