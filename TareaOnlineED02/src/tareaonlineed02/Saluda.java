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
    private static String nombre;
    public static String getNombre()
    {
        return nombre;
    }
    public static void setNombre(String Nombre)
    {
        
        nombre = Nombre;
    }
    public static String pideNombre()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("�Cual es tu nombre?");
        String tecla = teclado.next();
        setNombre(tecla);
        nombre = tecla;
        return nombre;
    }
    public static void main(String[] args) {
        
        pideNombre();
        System.out.print("Hoola ");
        System.out.println(getNombre());
        
   
      
    }
    
    
}
