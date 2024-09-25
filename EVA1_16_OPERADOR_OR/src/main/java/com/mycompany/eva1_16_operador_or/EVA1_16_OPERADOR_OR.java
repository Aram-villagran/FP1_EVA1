/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
       int KM, Months;
      Scanner captu = new Scanner (System.in);
      System.out.println("Cuanto kilometraje tiene el vehiculo?");
      KM = captu.nextInt();
      captu.nextLine();
      System.out.println("Cuantos meses tiene el vehiculo");
      Months= captu.nextInt();
      
      if (KM >= 5000 || Months >= 6){
         System.out.println("Toca cambio de aceite a su vehiculo");
    }else{
    System.out.println("No es necesario el cambio de aceite");
}
                  
    }
}
