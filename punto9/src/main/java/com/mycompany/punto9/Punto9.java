/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto9;

/**
 *
 * @author lechu
 */
import java.util.Scanner;
public class Punto9 {
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: division por cero");
            return 0;
        }
    }
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    public static double raizCuadrada(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            System.out.println("Error: no se puede calcular raiz de numero negativo");
            return 0;
        }
    }
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("--- CALCULADORA ---");
        System.out.print("Ingrese el primer numero: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = sc.nextDouble();

        System.out.println("\nResultados:");
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicacion: " + multiplicar(a, b));
        System.out.println("Division: " + dividir(a, b));
        System.out.println("Potencia (a^b): " + potencia(a, b));
        System.out.println("Raiz cuadrada de a: " + raizCuadrada(a));
        System.out.println("Raiz cuadrada de b: " + raizCuadrada(b));

        sc.close();
    }
}
