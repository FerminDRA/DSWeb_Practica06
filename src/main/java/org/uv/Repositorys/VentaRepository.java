/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.Model.Venta;

/**
 *
 * @author fermin
 */
public interface VentaRepository extends JpaRepository<Venta, Integer> {
    
}
