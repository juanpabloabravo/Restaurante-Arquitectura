package com.microservice.juan.Controllers;

// InventarioController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.microservice.juan.Entity.Ingrediente;
import com.microservice.juan.Service.InventarioService;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Ingrediente> getInventario() {
        return inventarioService.getInventario();
    }

    @PostMapping("/actualizar")
    public void actualizarInventario(@RequestBody List<Ingrediente> ingredientesActualizados) {
        inventarioService.actualizarInventario(ingredientesActualizados);
    }
}

