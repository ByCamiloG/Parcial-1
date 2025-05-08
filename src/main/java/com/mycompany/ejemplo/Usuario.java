/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo;


public class Usuario {
    public String Nombre;
    public int Identificacion;
    
    public Usuario(String Nombre, int Identificacion) {
    this.Nombre = Nombre;
    this.Identificacion = Identificacion;
    }
// Getters
    public String getNombre() {
        return Nombre;
    }

    public int getIdentificacion() {
        return Identificacion;
    }
    
}
