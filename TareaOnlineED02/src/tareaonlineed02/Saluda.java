/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonlineed02;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.next();
        
        System.out.print("Hola ");
        System.out.println(nombre);
        
        String nomb = nombre;
    }
    
}
