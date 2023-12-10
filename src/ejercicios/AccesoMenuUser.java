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
public class AccesoMenuUser {
    public static Scanner entra = new Scanner(System.in);
    public static String[] user = new String[2];
    
      

    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        
        Inicio();

        while (true) {
            int opcion = entra.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado registrase");
                    Registro();
                    Inicio();
                    break;
                case 2:
                    System.out.println("Ha seleccionado iniciar sesion");
                    IniciarSesion();
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro servicio");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }

    }

    public static void Registro() {
        Scanner entra = new Scanner(System.in);
        String nombre;
        String pass;

        System.out.println("Ingrese su nombre de usuario: ");
        nombre = entra.nextLine();
        user[0] = nombre;

        System.out.println("Ingrese su contraseña: ");
        pass = entra.nextLine();
        user[1] = pass;

        System.out.println("Registro exitoso");
    }

    public static void IniciarSesion() {
         Scanner entra = new Scanner(System.in);
        String valNombre = "";
        String valPass = "";

        System.out.println("Ingrese su nombre de usuario: ");
        valNombre = entra.nextLine();

        System.out.println("Ingrese su contraseña: ");
        valPass = entra.nextLine();

        if (valNombre.equals(user[0]) && valPass.equals(user[1])) {
            System.out.println("..........................");
            Menu();
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos");
        }
    }

    public static void Inicio() {
         Scanner entra = new Scanner(System.in);
        System.out.println("Bienvenido! Que desea realizar: \n"
                + "1.Registro\n"
                + "2.Iniciar Seccion\n"
                + "3.Salir"
        );
    }
    
        
    public static void Menu(){
        Scanner capturar = new Scanner(System.in);
        System.out.println("Inicio de sesion exitoso, ahora tiene ingreso al siguiente menu: \n"
        
                +"1.Calculadora Operaciones\n"
                +"2.Calculadora IMC\n"
                +"3.Calculadora Binaria\n"

        );
        int opcion = entra.nextInt();
             switch (opcion) {
               case 1:
                 
                    //Declaracion de variables 

                    int opc;
                    int num1;
                    int num2;
                    int resultado;


                        System.out.println("Ingrese el primer number");
                        num1 = entra.nextInt();
                         System.out.println("Ingrese el Segundo number");
                        num2 = entra.nextInt();

                   System.out.println("Elige la operacion que quieres realizar: \n "
                           +"1.Suma\n"
                            +"2.Resta\n"
                            +"3.Multiplicacion\n"
                            +"4.Division\n"
                   );

                    opc = entra.nextInt();
                        switch (opc) {
                            case 1://Suma
                                resultado = num1 + num2;
                                System.out.println("El resultado es:"+ resultado );
                                break;
                            case 2:    
                                 resultado = num1 - num2;
                                System.out.println("El resultado es:"+ resultado );
                                break;
                            case 3:    
                                 resultado = num1 * num2;
                                System.out.println("El resultado es:"+ resultado );
                                break;
                            case 4:    
                                 resultado = num1 / num2;
                                System.out.println("El resultado es:"+ resultado );
                                break;
                            default:
                                System.out.println(".....Error........");
                        }  
                    break;
                case 2:
                    System.out.println("Ingresa tu peso en kilogramos: ");
                    double peso = entra.nextDouble();
                    System.out.println("Ingresa tu altura en metros: ");
                    double estatura = entra.nextDouble();

                    double imc = peso /(estatura*estatura);
                    System.out.println("Tu IMC es: " + imc);
                    if (imc < 18.5) {
                        System.out.println("Tu peso es bajo.");
                    } else if (imc < 25) {
                        System.out.println("Tu peso es normal.");
                    } else if (imc < 30) {
                        System.out.println("Tienes sobrepeso.");
                    } else if (imc < 40) {
                        System.out.println("Tienes obesidad.");
                    } else {
                        System.out.println("Tienes obesidad severa.");
                    }
                    break;
                case 3:
                    System.out.print("Introduce un número decimal: ");
                    int decimal = entra.nextInt();

                    String binario = "";
                    int cociente = decimal;

                    while (cociente > 0) {
                        int resto = cociente % 2;
                        binario = resto + binario;
                        cociente = cociente / 2;
                    }

                    System.out.println("El número binario es: " + binario);
                default:
                    System.out.println("Opción no válida.");

            }
          Val();
    }
    
    public static void Val(){
     Scanner entra = new Scanner(System.in);
    
       System.out.println("Desea Voler al Menu si/no ");
             String res = "";
             res= entra.nextLine();
             if (res.equals("si")) {
                 Menu();
            
             }else {
                 System.out.println("Saliendo del sistema.");
                  System.exit(0);
             }
    
    }
}
/*
1 Programa que almacene una matriz los usuarios q se registren 
 2 Los usuario podrán iniciar sección
3 Al iniciar sección deben encontrar un menú qué les permita imprimir sus datos de registro y actualizarlo
4 una delas opciones es usar una calculadora
5 otra opción es usar una calculadora de índice de masa corporal
 */