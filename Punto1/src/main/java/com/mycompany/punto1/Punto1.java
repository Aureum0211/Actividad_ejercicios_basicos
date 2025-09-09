/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1;

/**
 *
 * @author lechu
 */
import java.util.Scanner;

public class Punto1 {
    private String nombre;
    private int edad;
    private String correo;

    // Constructor
    public Punto1(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    // Métodos
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean correoValido() {
        return correo.contains("@");
    }

    public String mostrarDatosTexto() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Correo: " + correo;
    }

    public String mostrarDatosJSON() {
        return "{ \"nombre\": \"" + nombre + "\", \"edad\": " + edad + ", \"correo\": \"" + correo + "\" }";
    }

    // Método main dentro de Punto1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        Punto1 p = new Punto1(nombre, edad, correo);

        System.out.println("\n--- DATOS ---");
        System.out.println(p.mostrarDatosTexto());
        System.out.println("JSON: " + p.mostrarDatosJSON());
        System.out.println("Mayor de edad?: " + p.esMayorDeEdad());
        System.out.println("Correo valido?: " + p.correoValido());

        sc.close();
    }
}


