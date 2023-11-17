/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author fermin
 */

@Entity
@Table(name = "venta")
public class Venta implements Serializable{
    
    @Id
    @GeneratedValue(generator = "venta_idventa_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "venta_idventa_seq",sequenceName = "venta_idventa_seq",
            initialValue = 1, allocationSize = 1)
    @Column(name = "idventa")
    private int idVenta;
    
    @Column(name = "fecha")
    @NotNull
    private Date fecha;
    
    @Column(name = "total")
    @NotNull
    private BigDecimal total;

    public Venta(Date fecha, BigDecimal total) {
        this.fecha = fecha;
        this.total = total;
    }
    
    

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

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
    
    
}