package com.microservice.orden.services;

import com.microservice.orden.models.Orden;
import com.microservice.orden.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository ordenRepository;

    public Orden createOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    public Orden getOrdenById(Long id) {
        Optional<Orden> optionalOrden = ordenRepository.findById(id);
        return optionalOrden.orElse(null);
    }

    public Orden updateOrden(Long id, Orden updatedOrden) {
        Optional<Orden> optionalOrden = ordenRepository.findById(id);
        if (optionalOrden.isPresent()) {
            updatedOrden.setId(id);
            return ordenRepository.save(updatedOrden);
        } else {
            return null;
        }
    }

    public List<Orden> getAllOrdenes() {
        return ordenRepository.findAll();
    }
}
