/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package org.uv.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.uv.Model.Empleado;
import org.uv.Repositorys.EmpleadoRepository;

/**
 *
 * @author fermin
 */
@Validated
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository empRep;
    
    @GetMapping()
    public List<Empleado> getAllEmpleados() {
        return empRep.findAll();
    }
    
    @GetMapping("/{id}")
    public Empleado get(@PathVariable int id) {
        Optional<Empleado> opc=empRep.findById(id);
        return opc.get();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Empleado> put(@PathVariable String id, @RequestBody Empleado emp) {
        Optional<Empleado> opc= empRep.findById(Integer.parseInt(id));
        if(opc.isPresent()){
            Empleado camEmp=empRep.save(emp);
            return ResponseEntity.ok(camEmp);
        }
        return (ResponseEntity<Empleado>) ResponseEntity.notFound();
    }
    
    @PostMapping
    public ResponseEntity<Empleado> post(@RequestBody Empleado emp) {
        Empleado empleado= empRep.save(emp);
        return ResponseEntity.ok(empleado);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
