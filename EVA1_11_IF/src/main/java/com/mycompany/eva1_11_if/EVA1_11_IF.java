/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
        //Condicional
        //Logica booleana --> operaciones de verdadero o falso
        //Solicitar la edad en años
        //> Mayor que
        //< Menor que
        //== Igual que
        // != Diferente que
        // >= Mayor o igual
        // <= Menor o igual
        // ! Negación
        // && y (And)
        //|| o (Or)
        Scanner Captu = new Scanner (System.in);
        int edad;
        System.out.println("Captura la edad: ");
        edad = Captu.nextInt();
        //Determinar si es un adulto o no
        //Las operaciones logicas solo generan como resultado un verdadero o falso
        //si son varias instruccoines, hay que agruparlas con llaves
        if (edad >= 18){ //Bloque para el verdadero
            System.out.println("Es un adulto");
            
        } else{ //bloque para el falso
            System.out.println("Menor de edad!!!");
            
        }
        
        
        
        
        
                
    }
}
