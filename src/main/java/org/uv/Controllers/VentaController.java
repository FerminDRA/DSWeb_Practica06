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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.uv.DTOs.VentaConDetallesDTO;
import org.uv.Model.Venta;
import org.uv.Model.VentaDetalle;
import org.uv.Repositorys.VentaDetalleRepository;
import org.uv.Repositorys.VentaRepository;

/**
 *
 * @author fermin
 */
@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired 
    private VentaRepository ventaRep;
    @Autowired
    private VentaDetalleRepository vDetalleRep;
    
    @GetMapping()
    public List<Venta> list() {
        return ventaRep.findAll();
    }
    
    @GetMapping("/{id}")
    public Venta get(@PathVariable int id) {
        Optional<Venta> opc=ventaRep.findById(id);
        return opc.get();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<Venta> post(@RequestBody VentaConDetallesDTO ventaDto) {
        Venta newVenta= ventaRep.save(new Venta(ventaDto.getFecha(),ventaDto.getTotal()));
        List<VentaDetalle> detalles=ventaDto.getDetalles();
        VentaDetalle prod;
        for (VentaDetalle producto : detalles) {
            prod=vDetalleRep.save(new VentaDetalle(
            producto.getNombre(),
            producto.getPrecio(),
            producto.getCantidad(),
            newVenta));
        }
        return ResponseEntity.ok(newVenta);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error msg")
    public void handleError() {
    }
    
}



