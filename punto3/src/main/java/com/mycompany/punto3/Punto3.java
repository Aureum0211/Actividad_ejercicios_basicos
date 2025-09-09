/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto3;

/**
 *
 * @author lechu
 */
import java.util.Scanner;

public class Punto3 {
    private String nombre;
    private String codigo;
    private double promedio;

    // Constructor
    public Punto3(String nombre, String codigo, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.promedio = promedio;
    }

    // Getters y Setters(se me olvida)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    //Ver si aprueba
    public boolean aprueba() {
        return promedio >= 3.0;
    }

    //mostrar informacion
    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Codigo: " + codigo + ", Promedio: " + promedio;
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el codigo del estudiante: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = sc.nextDouble();

        Punto3 est = new Punto3(nombre, codigo, promedio);

        System.out.println("\n--- DATOS ESTUDIANTE ---");
        System.out.println(est.mostrarInformacion());
        System.out.println("Aprueba: " + est.aprueba());

        sc.close();
    }
}
