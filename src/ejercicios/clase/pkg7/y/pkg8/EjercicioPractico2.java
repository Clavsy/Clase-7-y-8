/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg7.y.pkg8;

import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        String eleccion;
        int edad;
        
        do{
            
            System.out.println("Ingresar nombre:");
            nombre = leer.next();
            
            System.out.println("Ingresar edad:");
            edad = leer.nextInt();
            
            mayorDeEdad(nombre, edad);
            
            System.out.println("Desea ingresar otra persona?");
            eleccion = leer.next();
            
        } while(!"No".equalsIgnoreCase(eleccion));
            
    }

    public static void mayorDeEdad(String nombre, int edad) {
        
        if(edad >= 18){
            
            System.out.println(nombre + " es mayor de edad.");
            
        } else {
            
            System.out.println(nombre + " no es mayor de edad.");
            
        }
        
    }
    
}
