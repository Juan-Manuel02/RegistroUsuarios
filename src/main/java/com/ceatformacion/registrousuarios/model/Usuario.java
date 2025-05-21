package com.ceatformacion.registrousuarios.model;

import java.time.LocalDate;

public class Usuario {

    private String nombreApellidos;
    private String userName;
    private String password;
    static int id;
    private String email;
    private int idUsuario;
    private LocalDate fechaRegistro;

    // Controlador
    public Usuario(String nombreApellidos, String userName, String password, String email, int idUsuario, String fechaRegistro) {
        this.nombreApellidos = nombreApellidos;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.idUsuario = ++idUsuario;
        this.fechaRegistro = LocalDate.parse(fechaRegistro);
    }

    // Constructor vacio.
    public Usuario() {
        this.idUsuario = ++id; // Incrementa el id.
    }

    // Getter y Setter
    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Usuario.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // To String
    @Override
    public String toString() {
        return "Usuario{" + "nombreApellidos:" + nombreApellidos +
                "\nUsuario: " + userName +
                "\nContraseña: " + password +
                "\nEmail: " + email +
                "\nID del usuario: " + idUsuario +
                "\nFecha de registro: " + fechaRegistro + '}';
    }

}
