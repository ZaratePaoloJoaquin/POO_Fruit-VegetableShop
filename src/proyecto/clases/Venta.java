/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

import java.time.LocalDate;
import java.time.LocalTime;


public class Venta {
    private int id;
    private LocalDate fecha;
    private String producto;
    private double precio;
    private String medida;
    private double descuento, cantidad, subtotal;

    public Venta() {
    }

    public Venta(int id, LocalDate fecha,String producto, double precio, String medida, double descuento, double cantidad, double subtotal) {
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
        this.medida = medida;
        this.descuento = descuento;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", producto=" + producto + ", precio=" + precio + ", medida=" + medida + ", descuento=" + descuento + ", cantidad=" + cantidad + ", subtotal=" + subtotal + '}';
    }
    
}