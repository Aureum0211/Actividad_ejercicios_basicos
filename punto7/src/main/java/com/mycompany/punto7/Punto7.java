/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto7;

/**
 *
 * @author lechu
 */
import java.util.ArrayList;
import java.util.Scanner;

class DetallePedido {
    private String nombreProducto;
    private int cantidad;
    private double precioUnitario;

    public DetallePedido(String nombreProducto, int cantidad, double precioUnitario) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return nombreProducto + " x" + cantidad + " @ " + precioUnitario + " = " + calcularSubtotal();
    }
}

public class Punto7 {
    private int numeroPedido;
    private double porcentajeDescuento;
    private ArrayList<DetallePedido> detalles;

    public Punto7(int numeroPedido, double porcentajeDescuento) {
        this.numeroPedido = numeroPedido;
        this.porcentajeDescuento = porcentajeDescuento;
        this.detalles = new ArrayList<>();
    }

    // detalle
    public void agregarDetalle(DetallePedido d) {
        detalles.add(d);
    }

    //subtotal
    public double calcularSubtotal() {
        double subtotal = 0;
        for (DetallePedido d : detalles) {
            subtotal += d.calcularSubtotal();
        }
        return subtotal;
    }

    //total con descuento
    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double descuento = subtotal * (porcentajeDescuento / 100);
        return subtotal - descuento;
    }

    // Mostrar
    public void mostrarPedido() {
        System.out.println("Pedido #" + numeroPedido);
        System.out.println("Detalles:");
        for (DetallePedido d : detalles) {
            System.out.println(" - " + d.toString());
        }
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento: " + porcentajeDescuento + "%");
        System.out.println("Total: " + calcularTotal());
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.print("Numero del pedido: ");
        int numero = sc.nextInt();
        System.out.print("Porcentaje de descuento: ");
        double descuento = sc.nextDouble();
        sc.nextLine();

        Punto7 pedido = new Punto7(numero, descuento);

        System.out.print("Cuantos productos va a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nProducto " + i + ":");
            System.out.print("Nombre: ");
            String nombreP = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            System.out.print("Precio unitario: ");
            double precioU = sc.nextDouble();
            sc.nextLine();
            pedido.agregarDetalle(new DetallePedido(nombreP, cantidad, precioU));
        }
        System.out.println("\n--- DATOS DEL PEDIDO ---");
        pedido.mostrarPedido();

        sc.close();
    }
}
