/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiante3;

/**
 *
 * @author lechu
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //datos
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el codigo del estudiante: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = sc.nextDouble();
        Estudiante3 e1 = new Estudiante3(nombre, codigo, promedio);

        // Mostrar informacion y validacion
        e1.mostrarInformacion();
        System.out.println("El estudiante aprueba? " + e1.aprueba());

        sc.close();
    }
}
