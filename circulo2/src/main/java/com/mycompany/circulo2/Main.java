/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circulo2;

/**
 *
 * @author lechu
 */
public class Main {
    public static void main(String[] args) {
        // Crear círculos
        Circulo2 c1 = new Circulo2(5);
        Circulo2 c2 = new Circulo2(10);

        // Probar métodos
        System.out.println("Circulo 1 -> " + c1.mostrarDatos());
        System.out.println("Circulo 2 -> " + c2.mostrarDatos());
    }
}
