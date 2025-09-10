/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rueda6;

/**
 *
 * @author lechu
 */
import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private ArrayList<Rueda6> ruedas;

    // Constructor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = new ArrayList<>();
    }

    // Agregar ruedas
    public void agregarRueda(Rueda6 rueda) {
        if (ruedas.size() < 4) {
            ruedas.add(rueda);
        } else {
            System.out.println("El carro ya tiene 4 ruedas");
        }
    }

    // Calcular total de las ruedas
    public double valorTotalRuedas() {
        double total = 0;
        for (Rueda6 r : ruedas) {
            total += r.getPrecio();
        }
        return total;
    }

    // Mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Ruedas:");
        for (Rueda6 r : ruedas) {
            System.out.println(" - " + r);
        }
        System.out.println("Valor total de ruedas: " + valorTotalRuedas());
    }
}
