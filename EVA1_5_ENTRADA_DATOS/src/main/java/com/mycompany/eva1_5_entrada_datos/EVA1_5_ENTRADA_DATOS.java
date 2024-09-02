/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
    //TODO code application logic here
//DECLARAMOS VARIABLES
String marca;
String modelo;
int year;
double precio;
//¿como se captura?
//SCANNER
//Herramienta--> Clase: nos proporcionan muchas herramientas
Scanner captu; //declaramos la herramienta, previamente
                //hay que importarla, (hacer un import)
captu = new Scanner(System.in);//creamos la herramienta

//Hay que indicarle al usuario que capturar
System.out.println("Introduce la marca del vehiculo:");
//capturamos--> una asignación
marca = captu.nextLine();//les regresa todo el texto hasta cuando
                        //se presiona la tecla "enter"

System.out.println("Introduce el modelo del vehiculo:");
modelo = captu.nextLine();
System.out.println("Introduce el year:");
year= captu.nextInt();
System.out.println("Introduce el precio:");
precio= captu.nextDouble();
System.out.println("DATOS CAPTURADOS---------");
System.out.println(marca);
System.out.println(modelo);
System.out.println(year);
System.out.println(precio);

    }
}
