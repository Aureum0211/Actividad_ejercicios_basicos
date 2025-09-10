/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libro4;

/**
 *
 * @author lechu
 */
public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro4 libro1 = new Libro4("Programacion en Java", "Editorial ABC", 2020,
                                 "Carlos", "Perez", 50000);

        // Mostrar informacion inicial
        libro1.mostrarInformacion();
        System.out.println("Referencia APA: " + libro1.formatoAPA());

        // Aplicar descuento
        libro1.aplicarDescuento(20);
        System.out.println("Precio despues del descuento: " + libro1.getPrecio());
    }
}
