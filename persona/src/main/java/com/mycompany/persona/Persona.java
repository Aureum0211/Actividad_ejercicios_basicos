/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author lechu
 */
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String correo;

    // Constructor
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Métodos propios
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public boolean correoValido() {
        return this.correo.contains("@");
    }

    public String mostrarDatosTexto() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Correo: " + correo;
    }

    public String mostrarDatosJSON() {
        return "{ \"nombre\": \"" + nombre + "\", \"edad\": " + edad + ", \"correo\": \"" + correo + "\" }";
    }
}
