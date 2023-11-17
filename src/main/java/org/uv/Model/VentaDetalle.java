/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.Model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author fermin
 */
@Entity
@Table(name = "venta_detalle")
public class VentaDetalle {
    @Id
    @GeneratedValue(generator = "venta_detalle_iddetalleventa_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "venta_detalle_iddetalleventa_seq",sequenceName = "venta_detalle_iddetalleventa_seq",
            initialValue = 1, allocationSize = 1)
    @Column(name = "iddetalleventa")
    private int idDetalleVenta;
    
    @NotNull
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull
    @Column(name = "precio")
    private BigDecimal precio;
    
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idventa",referencedColumnName = "idventa")
    private Venta venta;

    public VentaDetalle(String nombre, BigDecimal precio, int cantidad, Venta venta) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.venta = venta;
    }
    
    

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
}