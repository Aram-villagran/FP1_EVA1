/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        double d,a,t,v;           
       Scanner captu= new Scanner(System.in);
       
          System.out.println("Introduzca la velocidad:" );
          v= captu.nextDouble();
          System.out.println("Introduzca el tiempo: ");
          t = captu.nextDouble();
          System.out.println("Introduzca la aceleracion: ");
          a = captu.nextDouble();
         
           d= v * t + (a* t * t) / 2;
           System.out.println("Su distancia es :" + d);
           
           
            
          
          


        
      





    }
}
