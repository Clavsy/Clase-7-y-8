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
public class EjercicioPractico4 {
    
        public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero. Se determinara si es numero primo.");
        int num = leer.nextInt();
        
            System.out.println(esPrimo(num));
            
    }

    public static boolean esPrimo(int num) {
        
        boolean retorno = false;
        int contador = 0;
        int paso = 0;
        
        do{
            
            paso++;
                    
            if(num%paso == 0){
            contador++;
            }       

        } while(paso != num);
 
         if(contador == 2){
            retorno = true;
            }
        
        return retorno;
    }
}

        
