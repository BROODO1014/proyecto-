
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Flores Arce
 */
public class NombreApellido {
     public static void main(String[] args){
       Scanner teclado= new Scanner(System.in);
         String Nombre;
         String Apellido1;
         String Apellido2;
       System.out.println("hola usuario");
    System.out.println("ingres su nombre por favor");
          Nombre=teclado.next();
          System.out.println("ingres su apellido paterno por favor");
          Apellido1=teclado.next();
          System.out.println("ingres su apellido materno por favor");
          Apellido2=teclado.next();
          System.out.println(Nombre +Apellido1 +Apellido2);
          
     }
}
