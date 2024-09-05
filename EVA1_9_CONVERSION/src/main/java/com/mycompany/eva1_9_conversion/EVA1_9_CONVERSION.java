/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversion;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_9_CONVERSION {

    public static void main(String[] args) {
   double farenheit, celsius, kelvin;
   Scanner captu= new Scanner (System.in);
   //convertir farenheit a celsius
    System.out.println("Temperatura en grados farenheit");
    farenheit = captu.nextDouble();
    celsius = (farenheit - 32) / 1.8;
    System.out.println("°C = " + celsius);
    //convertir celsius a farenheit
    System.out.println("Temperatura en grados celsius");
    celsius = captu.nextDouble();
    farenheit= (celsius * 1.8) + 32;
    System.out.println("°f = " + farenheit);
    //convertir de celsius a kelvin
    System.out.println("Temperatura en grados kelvin");
    kelvin= captu.nextDouble();
    kelvin= (celsius + 273.15);
    System.out.println("°k = " + celsius);
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
