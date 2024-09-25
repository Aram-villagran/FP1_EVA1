/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_inicio;
import java.util.Scanner;
/**
 *
 * @author aramv
 */
public class EVA1_15_PANTALLA_INICIO {

    public static void main(String[] args) {
final String USUARIO= "Admin";
final String PASSWORD= "Admin1234";
String Password, User;

Scanner captu = new Scanner (System.in);
System.out.println("Usuario");
User = captu.nextLine();
System.out.println("Password:");
Password = captu.nextLine();
//Como validamos el acceso?

if (User.equals(USUARIO) && Password.equals(PASSWORD)){
System.out.println("ACCESO CONCEDIDO");
 }else{
System.out.println("ACCESO DENEGADO");}

    }
}
