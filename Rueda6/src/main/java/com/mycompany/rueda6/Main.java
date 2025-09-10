/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rueda6;

/**
 *
 * @author lechu
 */
public class Main {
    public static void main(String[] args) {
        // Crear carro
        Carro carro = new Carro("Toyota", "Corolla");

        // Crear ruedas
        Rueda6 r1 = new Rueda6("Michelin", 16, 300.0);
        Rueda6 r2 = new Rueda6("Michelin", 16, 300.0);
        Rueda6 r3 = new Rueda6("Michelin", 16, 300.0);
        Rueda6 r4 = new Rueda6("Michelin", 16, 300.0);

        carro.agregarRueda(r1);
        carro.agregarRueda(r2);
        carro.agregarRueda(r3);
        carro.agregarRueda(r4);

        carro.mostrarInformacion();
    }
}
