/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto8;

/**
 *
 * @author lechu
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Punto8 {
    private String nombre;
    private LocalDate fechaNacimiento;
    public Punto8(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Edad: " + calcularEdad();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese anio de nacimiento: ");
        int anio = sc.nextInt();
        System.out.print("Ingrese mes de nacimiento (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Ingrese dia de nacimiento: ");
        int dia = sc.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);
        Punto8 persona = new Punto8(nombre, fecha);

        System.out.println("\n--- DATOS PERSONA ---");
        System.out.println(persona.mostrarInformacion());

        sc.close();
    }
}

