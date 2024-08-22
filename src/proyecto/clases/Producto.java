/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

public class Producto {
    private int id;
    private String categoria,descripcion;
    private double precio;
    private double descuento;
    private String medida;
    private double stock;

    public Producto() {
    }

    public Producto(int id, String categoria, String descripcion, double precio, double descuento, String medida, double stock) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.medida = medida;
        this.stock = stock;
    }

    public Producto(int id, String descripcion, double precio, double descuento, String medida) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.medida = medida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", categoria=" + categoria + ", descripcion=" + descripcion + ", precio=" + precio + ", descuento=" + descuento + ", medida=" + medida + ", stock=" + stock + '}';
    }

}
