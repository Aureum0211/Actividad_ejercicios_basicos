/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso5;

/**
 *
 * @author lechu
 */
public class Estudiante {
    private String nombre;
    private String codigo;
    private Curso5 curso; // Asociacion con Curso5

    // Constructor
    public Estudiante(String nombre, String codigo, Curso5 curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
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

    public Curso5 getCurso() {
        return curso;
    }

    public void setCurso(Curso5 curso) {
        this.curso = curso;
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre +
                           ", Codigo: " + codigo +
                           ", Curso: " + curso);
    }

    // Metodo para comparar cursos
    public boolean mismoCurso(Estudiante otro) {
        return this.curso.getNombreCurso().equalsIgnoreCase(otro.getCurso().getNombreCurso());
    }
}
