
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
public class EdadCla {
    public static void main(String[] args){
       Scanner teclado= new Scanner(System.in);
       int Edad;
      
       System.out.println("HOLA USUARIO");
       System.out.println("VEREMOS QUE TAN VIEJO ERES");
       System.out.println("POR FAVOR ME PODRIAS DECIR QUE EDAD TIENES");
       Edad=teclado.nextInt();
      if(Edad>=18){
          System.out.println("YA ERES ADULTO");
      }
      else{
          System.out.print("ERES JOVEN");
          
          if(Edad>25){
              System.out.println("YA ERES UN GODINES ");
              
      }
              
       
     }
     
    
}
}
