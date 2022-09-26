/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import java.time.LocalDate;

/**
 *
 * @author Javier
 */
public class Factura {

    public static enum Estado {
        EMITIDA, RECIBIDA, CANCELADA, PAGADA
    }

    public static class DireccionFactura extends Direccion {
    }

    public class Linea {

        private String producto;
        private int catidad;
        private double precioUnitario;

        public Linea(String producto, int catidad, double precioUnitario) {
            this.producto = producto;
            this.catidad = catidad;
            this.precioUnitario = precioUnitario;
        }

        public String getProducto() {
            return producto;
        }

        private void setProducto(String producto) {
            this.producto = producto;
        }

        public int getCatidad() {
            return catidad;
        }

        private void setCatidad(int catidad) {
            this.catidad = catidad;
        }

        public double getPrecioUnitario() {
            return precioUnitario;
        }

        private void setPrecioUnitario(double precioUnitario) {
            this.precioUnitario = precioUnitario;
        }

        public int getFactura() {
            return numero;
        }
    }

    private int numero;
    private Persona cliente;
    private Direccion direccion;
    private LocalDate fecha;
    private Estado estado;
    private Linea[] lineas = new Linea[100];

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Linea[] getLineas() {
        return lineas.clone();
    }

    public Linea getLinea(int indice) {
        return lineas[indice]; // clonar
    }

    public void addLinea(String producto, int catidad, double precioUnitario) {
        var linea = new Linea(producto, catidad, precioUnitario);
        linea.catidad = 0;
        this.lineas[0] = linea;
    }

    public void addLinea(Linea linea) {
        this.lineas[0] = linea;
    }

}
