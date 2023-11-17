/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.DTOs;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import org.uv.Model.VentaDetalle;

/**
 
 * @author fermin
 
 */
public class VentaConDetallesDTO {
    private Date fecha;
    private BigDecimal total;
    private List<VentaDetalle> detalles;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<VentaDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<VentaDetalle> detalles) {
        this.detalles = detalles;
    }
    
    
    
}


