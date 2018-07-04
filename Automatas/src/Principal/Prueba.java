/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author JuandeJesus
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String ab="abcdgggg";
        Scanner a= new Scanner(System.in);
//        System.out.println("Cual es el abecedario que requiere?");
//        System.out.print("Σ ");
//        String abc=a.next();
//        System.out.println("Cuantos estados requiere?");
//         System.out.print("Estados :");
//         int est=a.nextInt();
            Proceso obj= new Proceso("abc",4);
         obj.Imprimir();
         
         int opcion=0;
         do{
          
         System.out.println("Desea ingresar una cadena a evaluar?");
         System.out.println("1.Si");
         System.out.println("2.No");
         opcion=a.nextInt();
         
         switch(opcion){
         
             case 1: 
               try{
                   Proceso objeto= new Proceso("abc",4);
             
                   System.out.println("Proporcione la cadena a evaluar");
                String cad=a.next();
                objeto.cadena_caracteres(cad);
                objeto.Evaluar2(0);
                
               }catch(Exception e){System.out.println("Por favor ingrese una opcion correcta");}
         
         
         }}while(opcion!=2);
         
    }
    
}
