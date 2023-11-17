/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.uv.Model.VentaDetalle;

/**
 *
 * @author fermin
 */
public interface VentaDetalleRepository extends CrudRepository<VentaDetalle, Integer> {
    
}
