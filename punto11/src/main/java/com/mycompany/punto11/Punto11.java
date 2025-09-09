/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto11;

/**
 *
 * @author lechu
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    private String username;
    private String password;
    private String correo;
    private LocalDate fechaRegistro;
    public Usuario(String username, String password, String correo) {
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.fechaRegistro = LocalDate.now();
    }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getCorreo() { return correo; }
    public LocalDate getFechaRegistro() { return fechaRegistro; }

    public boolean correoValido() {
        return correo.contains("@");
    }

    public boolean passwordValida() {
        return password.length() >= 8;
    }
}

class SesionUsuario {
    private LocalDate fechaInicio;
    private Usuario usuario;
    private boolean activa;

    public SesionUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.fechaInicio = LocalDate.now();
        this.activa = true;
    }

    public void mostrarDatos() {
        System.out.println("Sesion iniciada para: " + usuario.getUsername());
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Estado: " + (activa ? "Activa" : "Inactiva"));
    }
}

class GestorUsuarios {
    private ArrayList<Usuario> usuarios;

    public GestorUsuarios() {
        usuarios = new ArrayList<>();
    }

    public boolean registrarUsuario(Usuario u) {
        for (Usuario usr : usuarios) {
            if (usr.getUsername().equalsIgnoreCase(u.getUsername())) {
                System.out.println("Error: username ya existe");
                return false;
            }
        }
        if (!u.correoValido()) {
            System.out.println("Error: correo invalido");
            return false;
        }
        if (!u.passwordValida()) {
            System.out.println("Error: password debe tener minimo 8 caracteres");
            return false;
        }
        usuarios.add(u);
        System.out.println("Usuario registrado con exito");
        return true;
    }

    public SesionUsuario validarLogin(String username, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return new SesionUsuario(u);
            }
        }
        return null;
    }
}

public class Punto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestorUsuarios gestor = new GestorUsuarios();

        // Registrar dos usuarios prehechos
        gestor.registrarUsuario(new Usuario("juan", "password123", "juan@mail.com"));
        gestor.registrarUsuario(new Usuario("maria", "claveSegura", "maria@mail.com"));

        System.out.println("\n--- LOGIN ---");
        System.out.print("Ingrese username: ");
        String user = sc.nextLine();
        System.out.print("Ingrese password: ");
        String pass = sc.nextLine();

        SesionUsuario sesion = gestor.validarLogin(user, pass);

        if (sesion != null) {
            System.out.println("\nLogin exitoso:");
            sesion.mostrarDatos();
        } else {
            System.out.println("\nError: credenciales invalidas");
        }

        sc.close();
    }
}