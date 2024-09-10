/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
int cal; 
Scanner cap= new Scanner(System.in);
        System.out.println("Inserte su calificacion: ");
        cal= cap.nextInt();
        if (cal <= 70)
                System.out.println("N/A");
        else
                    System.out.println("Acreditada!!");
        



    }
}
