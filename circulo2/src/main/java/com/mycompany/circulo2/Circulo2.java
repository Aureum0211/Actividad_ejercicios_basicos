/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo2;

/**
 *
 * @author lechu
 */
public class Circulo2 {
    private double radio;

    // Constructor
    public Circulo2(double radio) {
        this.radio = radio;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos propios
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public String mostrarDatos() {
        return "Radio: " + radio + 
               ", Area: " + calcularArea() + 
               ", Circunferencia: " + calcularCircunferencia();
    }
}
