/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author lechu
 */
public class Main {
    public static void main(String[] args) {
        // Crear objeto Persona
        Persona p1 = new Persona("Carlos", 20, "carlos@email.com");
        Persona p2 = new Persona("Ana", 15, "anaemail.com"); // correo sin @

        // Probar métodos
        System.out.println(p1.mostrarDatosTexto());
        System.out.println("Mayor de edad? " + p1.esMayorDeEdad());
        System.out.println("Correo valido? " + p1.correoValido());
        System.out.println("En JSON: " + p1.mostrarDatosJSON());

        System.out.println("---------------------------");

        System.out.println(p2.mostrarDatosTexto());
        System.out.println("Mayor de edad? " + p2.esMayorDeEdad());
        System.out.println("Correo valido? " + p2.correoValido());
        System.out.println("En JSON: " + p2.mostrarDatosJSON());
    }
}
