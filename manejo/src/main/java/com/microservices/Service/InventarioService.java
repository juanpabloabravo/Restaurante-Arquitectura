package com.microservice.Service;

import org.springframework.stereotype.Service;

import com.microservice.juan.Entity.Ingrediente;

import java.util.List;

@Service
public class InventarioService {
    private List<Ingrediente> inventario;


    public List<Ingrediente> getInventario() {
        return inventario;
    }

    public void actualizarInventario(List<Ingrediente> ingredientesActualizados) {
        for (Ingrediente ingrediente : ingredientesActualizados) {
            for (Ingrediente inv : inventario) {
                if (inv.getIngrediente().equals(ingrediente.getIngrediente())) {
                    inv.setInventario(inv.getInventario() - ingrediente.getInventario());
                    break;
                }
            }
        }
    }
}
