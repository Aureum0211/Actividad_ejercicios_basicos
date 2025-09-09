/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto2;

/**
 *
 * @author lechu
 */
public class Punto2 {
    private double radio;

    // Constructorinador
    public Punto2(double radio) {
        this.radio = radio;
    }
    // Getter y Setter
    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
    // Main dentro de la misma clase
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el radio del ciculo: ");
        double r = sc.nextDouble();
        Punto2 c = new Punto2(r);
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Radio: " + c.getRadio());
        System.out.println("area: " + c.calcularArea());
        System.out.println("Circunferencia: " + c.calcularCircunferencia());
        sc.close();
    }
}
