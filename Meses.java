
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
public class Meses {
    public static void main (String[] arg){
       int Numerito;
        System.out.println("HOLA USUARIO");
        System.out.println("TE VOY A AYUDAR, PUES TE DIRE CUANTOS DIAS TIENE EL MES QUE TU ME DIGAS");
        System.out.println("POR FAVOR ESCOJE UN NUMERO ENTRE EL 1 Y EL 12");
        Scanner scan = new Scanner(System.in);
        Numerito = scan.nextInt();
        if (Numerito==1 && Numerito ==3 && Numerito ==5&& Numerito==7 && Numerito ==9 &&Numerito ==11){
             System.out.println("ESTE MES TIEN 30 DIAS ");
        }else 
            if (Numerito!=2){
             System.out.println("ESTE MES TIENE 31 DIAS");
        }
        if(Numerito==2){
             System.out.println("ESTE MES TIENE 28 DIAS A MENOS QUE SEA UN AÑO VICIESTO TENDRIA 29 ");
             System.out.println("DATO CURIOSO, FEBRERO ES EL MES MAS CORTO DE TODOS ");
        }

    }   
}