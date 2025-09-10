/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rueda6;

/**
 *
 * @author lechu
 */
public class Rueda6 {
    private String marca;
    private int tamano;
    private double precio;

    // Constructor
    public Rueda6(String marca, int tamano, double precio) {
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Tamano: " + tamano + ", Precio: " + precio;
    }
}
