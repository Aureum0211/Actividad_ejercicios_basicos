/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso5;

/**
 *
 * @author lechu
 */
public class Main {
    public static void main(String[] args) {
        // Crear cursos
        Curso5 curso1 = new Curso5("Programacion II", 4);
        Curso5 curso2 = new Curso5("Matematicas", 3);

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan", "001", curso1);
        Estudiante e2 = new Estudiante("Ana", "002", curso1);
        Estudiante e3 = new Estudiante("Pedro", "003", curso2);

        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();

        // Comparar estudiantes
        System.out.println("Juan y Ana en mismo curso? " + e1.mismoCurso(e2));
        System.out.println("Juan y Pedro en mismo curso? " + e1.mismoCurso(e3));
    }
}
