/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto5;

/**
 *
 * @author lechu
 */
import java.util.Scanner;

// Clase Curso
class Curso {
    private String nombreCurso;
    private int creditos;

    public Curso(String nombreCurso, int creditos) {
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    @Override
    public String toString() {
        return nombreCurso + " (" + creditos + " creditos)";
    }
}

// Clase Estudiante (llamada Punto5 para cumplir con tu formato)
public class Punto5 {
    private String nombre;
    private String codigo;
    private Curso curso;

    public Punto5(String nombre, String codigo, Curso curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    // Metodo para mostrar info
    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Codigo: " + codigo + ", Curso: " + curso.toString();
    }
    //comparar si dos estudiantes estan en el mismo curso
    public boolean mismoCurso(Punto5 otro) {
        return this.curso.getNombreCurso().equalsIgnoreCase(otro.getCurso().getNombreCurso());
    }
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 estudiante
        System.out.print("Nombre del estudiante 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Codigo del estudiante 1: ");
        String codigo1 = sc.nextLine();
        System.out.print("Curso del estudiante 1: ");
        String curso1 = sc.nextLine();
        System.out.print("Creditos del curso 1: ");
        int creditos1 = sc.nextInt();
        sc.nextLine();

        //2 estudiante
        System.out.print("Nombre del estudiante 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Codigo del estudiante 2: ");
        String codigo2 = sc.nextLine();
        System.out.print("Curso del estudiante 2: ");
        String curso2 = sc.nextLine();
        System.out.print("Creditos del curso 2: ");
        int creditos2 = sc.nextInt();

        // Crear objetos
        Curso c1 = new Curso(curso1, creditos1);
        Curso c2 = new Curso(curso2, creditos2);

        Punto5 est1 = new Punto5(nombre1, codigo1, c1);
        Punto5 est2 = new Punto5(nombre2, codigo2, c2);

        // Mostrar
        System.out.println("\n--- DATOS ESTUDIANTES ---");
        System.out.println(est1.mostrarInformacion());
        System.out.println(est2.mostrarInformacion());
        //son companeros?
        if (est1.mismoCurso(est2)) {
            System.out.println("Ambos estudiantes estan en el mismo curso.");
        } else {
            System.out.println("Los estudiantes no estan en el mismo curso.");
        }
        sc.close();
    }
}
