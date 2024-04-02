package com.microservice.juan.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlazaMercadoService {
    @Value("${plaza_mercado_url}")
    private String plazaMercadoUrl;

    public int comprarIngrediente(String ingrediente) {
        RestTemplate restTemplate = new RestTemplate();

        String url = plazaMercadoUrl + "?ingredient=" + ingrediente;

        ResponseEntity<Integer> response = restTemplate.getForEntity(url, Integer.class);

        Integer cantidadComprada = response.getBody();

        if (cantidadComprada == null) {
            cantidadComprada = 0;
        }

        return cantidadComprada;
    }
}
