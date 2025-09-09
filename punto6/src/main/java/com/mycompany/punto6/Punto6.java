/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto6;

/**
 *
 * @author lechu
 */
import java.util.ArrayList;
import java.util.Scanner;

class Rueda {
    private String marca;
    private int tamano;
    private double precio;

    public Rueda(String marca, int tamano, double precio) {
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getTamano() { return tamano; }
    public void setTamano(int tamano) { this.tamano = tamano; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Rueda [marca=" + marca + ", tamano=" + tamano + ", precio=" + precio + "]";
    }
}

//llamar Punto6
public class Punto6 {
    private String marca;
    private String modelo;
    private ArrayList<Rueda> ruedas;

    public Punto6(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = new ArrayList<>();
    }
    public void agregarRueda(Rueda r) {
        if (ruedas.size() < 4) {
            ruedas.add(r);
        } else {
            System.out.println("El carro ya tiene 4 ruedas.");
        }
    }
    public double valorTotalRuedas() {
        double total = 0;
        for (Rueda r : ruedas) {
            total += r.getPrecio();
        }
        return total;
    }
    public void mostrarInformacion() {
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Ruedas:");
        for (Rueda r : ruedas) {
            System.out.println(" - " + r.toString());
        }
        System.out.println("Valor total ruedas: " + valorTotalRuedas());
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.print("Marca del carro: ");
        String marca = sc.nextLine();
        System.out.print("Modelo del carro: ");
        String modelo = sc.nextLine();

        Punto6 carro = new Punto6(marca, modelo);

        // Ingresar 4 ruedas
        for (int i = 1; i <= 4; i++) {
            System.out.println("\nRueda " + i + ":");
            System.out.print("Marca: ");
            String marcaR = sc.nextLine();
            System.out.print("Tamano: ");
            int tamanoR = sc.nextInt();
            System.out.print("Precio: ");
            double precioR = sc.nextDouble();
            sc.nextLine(); //limpiar

            carro.agregarRueda(new Rueda(marcaR, tamanoR, precioR));
        }

        System.out.println("\n--- DATOS DEL CARRO ---");
        carro.mostrarInformacion();

        sc.close();
    }
}
