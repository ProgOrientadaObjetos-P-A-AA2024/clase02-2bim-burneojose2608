/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
      
 
        while(bandera){
            System.out.println("Ingresa identificacion");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese la edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el numero de credito");
            int numeroCredito= entrada.nextInt();
            System.out.println("Ingrese el costo del credito");
            double costoCredito= entrada.nextDouble();
            entrada.nextLine();
             EstudiantePresencial estudiante = new EstudiantePresencial(nombre,
                     apellido, identificacion, edad, costoCredito, numeroCredito);
                  
            cadena = String.format("%s%s",cadena,estudiante);
            System.out.println("Desea salir, pulse s");
            String opcion = entrada.nextLine();
            if(opcion.equals("s")){
                bandera = false;
            }
        }
        
        
        System.out.printf("%s\n", cadena);
        
        
    }
}




