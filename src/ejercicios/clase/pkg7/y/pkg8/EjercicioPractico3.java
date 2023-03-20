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
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("CONVERSOR DE EUROS");
        System.out.println("A que moneda desea convertir?");
        System.out.println("  1 - A libras.");
        System.out.println("  2 - A dolares.");
        System.out.println("  3 - A yenes.");
        int eleccion = leer.nextInt();
        
        System.out.println("Ingrese cantidad de euros:");
        double euros = leer. nextInt();
        
        switch(eleccion) {
            case 1:
                libras(euros);
                break;
            case 2:
                dolares(euros);
                break;
            case 3:    
                yenes(euros);
                break;
            default:
                System.out.println("Opcion ingresada invalida.");
        }
                
    }

    private static void libras(double euros) {
        
        System.out.println(euros + " euros equivalen a " + (euros*0.86) + " libras.");
        
    }

    private static void dolares(double euros) {
        
        System.out.println(euros + " euros equivalen a " + (euros*1.28611) + " dolares.");
        
    }

    private static void yenes(double euros) {
        
        System.out.println(euros + " euros equivalen a " + (euros* 129.852) + " yenes.");
        
    }
    
}
