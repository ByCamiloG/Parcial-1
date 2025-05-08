/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo;
import java.util.Scanner;


public class Ejemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un registro de libro
        System.out.println("registro de libro");
        System.out.println("Ingrese nombre del libro:");
        String registro1 = scanner.nextLine();
        
        System.out.println("Ingrese la categoria del libro (Ejemplo: Matematicas, Ingenieria, Infantil, ETC)");
        String categoria1 = scanner.nextLine();
        Biblioteca Biblioteca1 = new Biblioteca(registro1,categoria1);
        
 System.out.println("\n===== RESULTADOS DEl REGISTRO =====");
 System.out.println("El nombre de su libro es : " + registro1);
 System.out.println("La Categoria de su libro es " + categoria1);
 
 
         // Crear un registro de usuario
        String Nombre1 = scanner.nextLine();
        int Identificacion1 = scanner.nextInt();
        Usuario Usuario1 = new Usuario(Nombre1,Identificacion1);
        
 System.out.println("\n===== RESULTADOS DEl REGISTRO =====");
 System.out.println("El nombre de su Usuario es : " + Nombre1);
 System.out.println("La identificaion de su Usuario es " + Identificacion1);
    }

}


