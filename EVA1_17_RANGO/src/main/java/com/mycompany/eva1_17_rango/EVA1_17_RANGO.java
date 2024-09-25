/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rango;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_17_RANGO {

    public static void main(String[] args) {
       
        int Califa;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("Su calificacion es:");
        Califa = captu.nextInt();
        
        if ((Califa >= 0 ) && (Califa <= 100))
        System.out.println("Su calificacion es valida");
        else
            System.out.println ("Ingrese una calificacion valida");
    }
}
