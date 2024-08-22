/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

import java.time.LocalDate;

public class Gasto {
    private int id;
    private LocalDate fecha;
    private String razon,descripcion,monto;

    public Gasto() {
    }

    public Gasto(int id, LocalDate fecha, String razon, String descripcion, String monto) {
        this.id = id;
        this.fecha = fecha;
        this.razon = razon;
        this.descripcion = descripcion;
        this.monto = monto;
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

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMonto() {
        return monto;
    }

public void setMonto(String monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Gasto{" + "id=" + id + ", fecha=" + fecha + ", razon=" + razon + ", descripcion=" + descripcion + ", monto=" + monto + '}';
    }
    
}
