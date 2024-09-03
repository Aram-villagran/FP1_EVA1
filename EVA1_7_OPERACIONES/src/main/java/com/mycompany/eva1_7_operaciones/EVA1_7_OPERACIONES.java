/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author aramv
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
      //TODO code application logic here
      //OPERACIONES ARITMETICAS
int x = 10; //declaración y asignación;
int y = 5;
//declaración de multiples variables del mismo tipo
int suma, resta, divi, multi, pot, raiz;
//SUMA Y RESTA
      suma = x + y; //operador de suma +
      System.out.println("Suma de x + y: ");
      System.out.println(suma);
      
      resta = x - y; //operador de diferencia -
      System.out.println("Resta de x - y: ");
      System.out.println(resta);
      
      //Multiplicacion
      
     multi = x * y; //operador de la multiplicacion *
     System.out.println("Multiplicacion de x * y");
     System.out.println(multi);
     
     
     //DIVISION---> El manejo de tipos de datos
     //Si dividimos enteros, java da como resultado un entero
     
     divi= x / y;
     System.out.println("Division de x(10)/ y(5): ");
     System.out.println(divi);
//cambiamos los valores de x y 
        x = 11;
        y = 3;
     divi= x / y;
     System.out.println("Division de x11) / y(3)");
     System.out.println(divi);
     
     double val1 = 11;
     double val2 = 3;
     double diviD;
     diviD= val1 / val2;
     System.out.println("Division entre numeros decimales");
     System.out.println(diviD);
     
     
    }
}
