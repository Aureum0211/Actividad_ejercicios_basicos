/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto10;

/**
 *
 * @author lechu
 */
import java.util.Scanner;

public class Punto10 {
    private String titular;
    private double saldo;

    public Punto10(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    // Metodos
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("No se puede depositar en negativo");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente o cantidad invalida");
        }
    }
    public void transferir(Punto10 otraCuenta) {
        if (saldo > 0) {
            otraCuenta.depositar(saldo);
            saldo = 0;
        } else {
            System.out.println("No hay saldo para transferir");
        }
    }
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        // Crear cuentas
        System.out.print("Ingrese el nombre del titular 1: ");
        String t1 = sc.nextLine();
        System.out.print("Ingrese saldo inicial de la cuenta 1: ");
        double s1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese el nombre del titular 2: ");
        String t2 = sc.nextLine();
        System.out.print("Ingrese saldo inicial de la cuenta 2: ");
        double s2 = sc.nextDouble();

        Punto10 c1 = new Punto10(t1, s1);
        Punto10 c2 = new Punto10(t2, s2);

        System.out.println("\n--- ESTADO INICIAL ---");
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        // Operaciones
        System.out.println("\nCuenta 1 deposita 200");
        c1.depositar(200);

        System.out.println("Cuenta 2 retira 100");
        c2.retirar(100);

        System.out.println("\nCuenta 1 transfiere todo a cuenta 2");
        c1.transferir(c2);

        System.out.println("\n--- ESTADO FINAL ---");
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        sc.close();
    }
}

