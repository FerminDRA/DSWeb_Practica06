/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.Model.Empleado;

/**
 *
 * @author fermin
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    
}
