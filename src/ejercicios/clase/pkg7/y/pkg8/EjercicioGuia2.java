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
public class EjercicioGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese dos numeros para determinar si son multiplos:");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       
       EsMultiplo(num1, num2);
       
    }
    
    public static void EsMultiplo(int num1, int num2){
        
        if(num1%num2 == 0) {
            
            System.out.println("El primer numero es multiplo del segundo numero.");
            
        } else {
            
            System.out.println("El primer numero NO es multiplo del segundo numero.");
            
        }
        
    }
    
}
