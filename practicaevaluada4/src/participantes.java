/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smuri
 */
public class participantes {
    String nombreCompleto;
    int edad;
    String numeroCorredor;
    int tiempoEstimado;
    String categoria;

    public participantes(String nombreCompleto, int edad, String numeroCorredor, int tiempoEstimado) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.numeroCorredor = numeroCorredor;
        this.tiempoEstimado = tiempoEstimado;
        this.categoria = determinarCategoria(edad);
    }
    private String determinarCategoria(int edad) {
        if (edad < 18) {
            return "Juvenil";
        } else if (edad >= 18 && edad <= 39) {
            return "Adulto";
        } else {
            return "Master";
        }
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroCorredor() {
        return numeroCorredor;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroCorredor(String numeroCorredor) {
        this.numeroCorredor = numeroCorredor;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}


