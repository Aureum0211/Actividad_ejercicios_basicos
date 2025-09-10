/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiante3;

/**
 *
 * @author lechu
 */
public class Estudiante3 {
    private String nombre;
    private String codigo;
    private double promedio;

    // Constructor
    public Estudiante3(String nombre, String codigo, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.promedio = promedio;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Codigo: " + codigo + ", Promedio: " + promedio);
    }
    public boolean aprueba() {
        return promedio >= 3.0;
    }
}
