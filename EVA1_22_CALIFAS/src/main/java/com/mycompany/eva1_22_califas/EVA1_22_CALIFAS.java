/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA1_22_CALIFAS {

    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);

    int calificacion;
    
            System.out.println("Introduzca su calificación");
            calificacion = captu.nextInt();
            captu.nextLine();
            
             
       
          if ((calificacion <= 100) && (calificacion >= 90))
                      System.out.println("Su calificación es A");
          if ((calificacion <= 89) && (calificacion >= 80))
 System.out.println("Su calificación es B");
     if ((calificacion <= 79) && (calificacion >= 70))
System.out.println("Su calificación es C");
     if ((calificacion <= 69) && (calificacion >= 60))
 System.out.println("Su calificación es D");
         if ((calificacion <= 59) && (calificacion >= 0))
      System.out.println("Su calificación es F");
        
         else {
                 System.out.println("Ingrese una calificacion valida.");
    }

    }
}
