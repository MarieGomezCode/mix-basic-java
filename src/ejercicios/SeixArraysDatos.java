/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;


/**
 *
 * @author angela
 */
public class SeixArraysDatos {
  
        public static void main(String[] args) {
        
        String[] datos = {"ID", "Nombre", "Apellido", "Correo", "Contrasena"};
        String[] usuarioUno = {"1", "pepito", "perez", "pepito@mail.com", "xyz123"};

        
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i] + ": " + usuarioUno[i] );
        }
    }
}
