/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;
import java.util.Scanner;
/**
 * 
 *
 * @author aramv
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
//Nombre String
//Genero char
//Duracion (int)
//Reparto String
//Clasificacion String

String Nombre;
String Genero;
int Duracion;
String Reparto;
String Clasificacion;


Scanner cap= new Scanner(System.in);


System.out.println("Captura el Nombre de la pelicula");
Nombre = cap.nextLine();

System.out.println("Captura el Genero de la pelicula");
Genero = cap.nextLine();

System.out.println("Captura la Duracion de la pelicula");
Duracion = cap.nextInt();
cap.nextLine();

System.out.println("Captura el Reparto de la pelicula");
Reparto = cap.nextLine();

System.out.println("Captura la Clasificacion:");
Clasificacion= cap.nextLine();

System.out.println(Nombre);
System.out.println(Genero);
System.out.println(Duracion);
System.out.println(Reparto);
System.out.println(Clasificacion);


        }
}
