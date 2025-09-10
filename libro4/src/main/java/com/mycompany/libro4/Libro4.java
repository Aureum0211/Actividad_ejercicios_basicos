/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libro4;

/**
 *
 * @author lechu
 */
public class Libro4 {
    private String titulo;
    private String editorial;
    private int anioPublicacion;
    private String autorNombre;
    private String autorApellido;
    private double precio;

    // Constructor
    public Libro4(String titulo, String editorial, int anioPublicacion,
                 String autorNombre, String autorApellido, double precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.autorNombre = autorNombre;
        this.autorApellido = autorApellido;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutorNombre() {
        return autorNombre;
    }

    public void setAutorNombre(String autorNombre) {
        this.autorNombre = autorNombre;
    }

    public String getAutorApellido() {
        return autorApellido;
    }

    public void setAutorApellido(String autorApellido) {
        this.autorApellido = autorApellido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos propios
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            precio = precio - (precio * porcentaje / 100);
        }
    }

    public String formatoAPA() {
        return autorApellido.toUpperCase() + ", " + autorNombre.charAt(0) + ". (" +
               anioPublicacion + "). " + titulo + ". " + editorial + ".";
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo +
                           ", Editorial: " + editorial +
                           ", Anio: " + anioPublicacion +
                           ", Autor: " + autorNombre + " " + autorApellido +
                           ", Precio: " + precio);
    }
}
