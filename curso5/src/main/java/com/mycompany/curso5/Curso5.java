/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.curso5;

/**
 *
 * @author lechu
 */
public class Curso5 {
    private String nombreCurso;
    private int creditos;

    // Constructor
    public Curso5(String nombreCurso, int creditos) {
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    // Getters y Setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return nombreCurso + " (" + creditos + " creditos)";
    }
}
