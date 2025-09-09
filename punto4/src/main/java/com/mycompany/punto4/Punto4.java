/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto4;

/**
 *
 * @author lechu
 */
import java.util.Scanner;

public class Punto4 {
    private String titulo;
    private String editorial;
    private int anioPublicacion;
    private String autorNombre;
    private String autorApellido;
    private double precio;

    // Constructor
    public Punto4(String titulo, String editorial, int anioPublicacion, String autorNombre, String autorApellido, double precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.autorNombre = autorNombre;
        this.autorApellido = autorApellido;
        this.precio = precio;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public String getAutorNombre() { return autorNombre; }
    public void setAutorNombre(String autorNombre) { this.autorNombre = autorNombre; }

    public String getAutorApellido() { return autorApellido; }
    public void setAutorApellido(String autorApellido) { this.autorApellido = autorApellido; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Metodo para aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            precio -= precio * (porcentaje / 100);
        }
    }

    //formato APA
    public String formatoAPA() {
        return autorApellido + ", " + autorNombre.charAt(0) + ". (" + anioPublicacion + "). " + titulo + ". " + editorial + ".";
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.print("Titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Editorial: ");
        String editorial = sc.nextLine();
        System.out.print("Anio de publicacion: ");
        int anio = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Nombre del autor: ");
        String autorNombre = sc.nextLine();
        System.out.print("Apellido del autor: ");
        String autorApellido = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        Punto4 libro = new Punto4(titulo, editorial, anio, autorNombre, autorApellido, precio);

        System.out.println("\n--- DATOS LIBRO ---");
        System.out.println("Precio original: " + libro.getPrecio());
        libro.aplicarDescuento(10); // descuento
        System.out.println("Precio con descuento 10%: " + libro.getPrecio());
        System.out.println("Referencia APA: " + libro.formatoAPA());

        sc.close();
    }
}
